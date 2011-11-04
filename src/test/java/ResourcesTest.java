import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class ResourcesTest {
    @Test
    public void shouldLoadResourcesFromTheRootOfTheMainResourcesTree() {
        assertNotNull(ResourcesTest.class.getResource("root.properties"));
    }
    @Test
    public void shouldLoadResourcesFromAPackageInTheMainResourcesTree() {
        assertNotNull(ResourcesTest.class.getResource("abc/abc.properties"));
    }
    @Test
    public void shouldLoadResourcesFromAMetaInfDirectoryTheMainResourcesTree() {
        assertNotNull(ResourcesTest.class.getResource("META-INF/meta.properties"));
    }
}
