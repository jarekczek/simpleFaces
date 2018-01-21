import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.inject.Inject;
import java.util.logging.Logger;

@ManagedBean
public class Przycisk {
  @ManagedProperty("#{sessionBean}") SessionBean sessionBean;

  public SessionBean getSessionBean() {
    return sessionBean;
  }

  public void setSessionBean(SessionBean sessionBean) {
    this.sessionBean = sessionBean;
  }

  @PostConstruct
  public void init()
  {
    Logger.getLogger("jarek").info("bean Przycisk created.");
  }
  
  public String getOutcome()
  {
    Logger.getLogger("jarek").info("button przycisk pressed");
    return "test";
  }
  
  public Object action()
  {
    Logger.getLogger("jarek").info("action");
    sessionBean.inc();
    speak("action");
    return "actio";
  }

  public String getValue()
  {
    Logger.getLogger("jarek").info("get value");
    return "przycisk5";
  }
  
  public static void speak(String s)
  {
    try {
      Process p = Runtime.getRuntime().exec("D:/Program_Files/eSpeak/command_line/espeak.exe \"" + s + "\"");
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
