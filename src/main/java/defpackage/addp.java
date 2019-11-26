package defpackage;

import android.net.Uri;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* renamed from: addp */
final class addp implements aebm {
    private final /* synthetic */ Map a;
    private final /* synthetic */ byte[] b;
    private final /* synthetic */ String c;
    private final /* synthetic */ addo d;

    addp(addo addo, Map map, byte[] bArr, String str) {
        this.d = addo;
        this.a = map;
        this.b = bArr;
        this.c = str;
    }

    public final void a(xho xho) {
        addo addo = this.d;
        Map map = this.a;
        byte[] bArr = this.b;
        xgy d = xho.d();
        ArrayList arrayList = new ArrayList();
        for (Entry entry : d.b) {
            if ("Application-URL".equalsIgnoreCase((String) entry.getKey())) {
                arrayList.add((String) entry.getValue());
            }
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        adiq adiq = null;
        if (unmodifiableList.size() != 1) {
            xtl.a(addo.a, "Expected one Application-URL header. Found 0 or more");
        } else if (xho.e() == null) {
            xtl.b(addo.a, "no body found in response");
        } else {
            try {
                InputStream a = xho.e().a();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                synchronized (addo.b) {
                    while (true) {
                        int read = a.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    while (true) {
                    }
                }
                byte[] toByteArray = byteArrayOutputStream.toByteArray();
                DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
                newInstance.setNamespaceAware(true);
                NodeList elementsByTagName = newInstance.newDocumentBuilder().parse(new ByteArrayInputStream(toByteArray)).getDocumentElement().getElementsByTagName("device");
                if (elementsByTagName.getLength() == 0) {
                    xtl.a(addo.a, "No devices found in device description XML.");
                } else {
                    Element element = (Element) elementsByTagName.item(0);
                    adip d2 = adiq.q().a(addo.a(element, "friendlyName", "urn:schemas-upnp-org:device-1-0")).a(new adjg(addo.a(element, "UDN", "urn:schemas-upnp-org:device-1-0"))).b(addo.a(element, "manufacturer", "urn:schemas-upnp-org:device-1-0")).c(addo.a(element, "modelName", "urn:schemas-upnp-org:device-1-0")).d((String) map.get("SERVER"));
                    String str = (String) unmodifiableList.get(0);
                    if (str != null) {
                        d2.a(true);
                        Uri parse = Uri.parse(str);
                        Uri build = parse.buildUpon().appendPath(addo.c).build();
                        d2.b(parse);
                        d2.a(build);
                    } else {
                        d2.a(false);
                    }
                    adiq = d2.b();
                }
            } catch (Exception e) {
                xtl.a(addo.a, "Error parsing device description response: ", e);
            }
        }
        if (adiq != null) {
            this.d.a(this.c, adiq, this.a);
        }
    }

    public final void a(IOException iOException) {
        String str = addo.a;
        String valueOf = String.valueOf(this.c);
        String str2 = "Error reading device description from ";
        xtl.a(str, valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf), (Throwable) iOException);
    }
}
