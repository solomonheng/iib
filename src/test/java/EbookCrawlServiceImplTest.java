import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.EbookCrawlService;
import service.impl.EbookCrawlServiceImpl;

/**
 * Created by Suheng on 9/15/16.
 */
public class EbookCrawlServiceImplTest {
    private EbookCrawlService ebookCrawlService;

    @Before
    public void setUp() throws Exception {
        this.ebookCrawlService = new EbookCrawlServiceImpl();
    }

    @Test
    public void getEbookNameAndItsURI() throws Exception {
        Assert.assertEquals(null, this.ebookCrawlService.getEbookNameAndItsURI());
    }

    @After
    public void tearDown() throws Exception {
        this.ebookCrawlService = null;

    }
}
