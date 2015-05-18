// Error reading included file Templates/Classes/Templates/Licenses/license-default.txt
package dinamic_strings;

/**
 *
 * @author stasy
 */


public interface SimpleList {
    void add(String s);
    String get();
    String get(int id);
    String remove();
    String remove(int id);
    boolean delete();
}
