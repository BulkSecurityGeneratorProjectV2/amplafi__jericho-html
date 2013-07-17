import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import net.htmlparser.jericho.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
//	TagTest.class,
	SegmentTest.class,
//	ScriptTest.class,
	NodeIteratorTest.class,
	StreamedTextTest.class,
	StreamedParseTextTest.class,
	StreamedSourceTest.class,
	StreamedSourceHugeFileTest.class
//	,HTMLSanitiserTest.class
})
public class TestSuite {}
