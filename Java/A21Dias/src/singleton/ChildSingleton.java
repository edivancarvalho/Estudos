package singleton;
/**
 *
 * @author edivan
 */
public class ChildSingleton extends Singleton{
    
    protected ChildSingleton(){}
    
    public String toString(){
        return " I am the child singleton ";
    }
}
