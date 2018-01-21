import javax.faces.bean.ManagedBean;

@ManagedBean
public class MyBean {
  public String getText()
  {
    Przycisk.speak("my bean");
    return "ok";
  }
}
