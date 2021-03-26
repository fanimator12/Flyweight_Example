import java.util.HashMap;
import java.util.Map;

public class GlossaryFactory
{
  private static Map<String, AbstractProjectGlossary> glossaries = new HashMap<>();

  public static AbstractProjectGlossary getGlossary(String key)
  {
    AbstractProjectGlossary item = glossaries.get(key);
    if(item == null)
    {
      synchronized (glossaries)
      {
        item = glossaries.get(key);
        if(item == null)
        {
          item = new ProjectGlossary(key);
          glossaries.put(key, item);
        }
      }
    }
    return item;
  }
}
