package labassignment7_DocumentPrototypePattern;
import java.util.HashMap;
import java.util.Map;

public interface Document extends Cloneable
{
	Document clone();
	void open();
	String getType();
}
