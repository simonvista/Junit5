import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

import junit5tests.NestedTest;
import junit5tests.TaggingTest;
import junit5tests.TestAnnotationTest;
import login.LoginTest;

@RunWith(JUnitPlatform.class)
//Control junit5 test for classes

@SelectClasses(TaggingTest.class)
//Control junit5 test for IncludeTags and ExcludeTags
//@ExcludeTags({"smoke","sanity"})
@ExcludeTags("sanity")
//@IncludeTags({"smoke","regression"})
//@IncludeTags("smoke")

//Control junit5 test for classes
//@SelectClasses({NestedTest.class,TestAnnotationTest.class})
//@SelectClasses(TestAnnotationTest.class)
//@SelectClasses(LoginTest.class)
//@SelectClasses(NestedTest.class)

//Control junit5 test for packages
//@SelectPackages({"junit5tests","login"})
//@SelectPackages("login")
//@SelectPackages("junit5tests")
public class JUnit5Runner {
	
}
