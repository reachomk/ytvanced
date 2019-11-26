package defpackage;

import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;

/* renamed from: xwk */
public final class xwk {
    public static final Attributes a = new xwm();
    public static final Map b;
    private final SAXParserFactory c;

    public xwk(Map map) {
        String str = "SAX initilization error";
        amqw.a((Object) map);
        try {
            this.c = SAXParserFactory.newInstance();
            for (Entry entry : map.entrySet()) {
                this.c.setFeature((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
            }
        } catch (SAXNotRecognizedException e) {
            throw new RuntimeException(str, e);
        } catch (SAXNotSupportedException e2) {
            throw new RuntimeException(str, e2);
        } catch (ParserConfigurationException e3) {
            throw new RuntimeException(str, e3);
        }
    }

    public final Object a(InputStream inputStream, xwi xwi) {
        amqw.a((Object) inputStream);
        amqw.a((Object) xwi);
        try {
            XMLReader xMLReader;
            synchronized (this.c) {
                xMLReader = this.c.newSAXParser().getXMLReader();
            }
            xwl xwl = new xwl(xwi);
            xMLReader.setContentHandler(xwl);
            xMLReader.parse(new InputSource(inputStream));
            Object obj = xwl.a;
            if (obj != null) {
                return obj;
            }
            throw new xwg("XML is well-formed but invalid");
        } catch (ParserConfigurationException e) {
            throw new xwf(e);
        } catch (SAXException e2) {
            throw new xwf(e2);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("http://xml.org/sax/features/namespaces", Boolean.valueOf(false));
        hashMap.put("http://xml.org/sax/features/namespace-prefixes", Boolean.valueOf(true));
        b = Collections.unmodifiableMap(hashMap);
    }
}
