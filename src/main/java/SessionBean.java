import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class SessionBean {
  int count = 0;
  
  public void inc()
  {
    count++;
  }
  
  public int getCount()
  {
    return count;
  }
  
  public String getText()
  {
    Przycisk.speak("my bean");
    return "ok";
  }
}
