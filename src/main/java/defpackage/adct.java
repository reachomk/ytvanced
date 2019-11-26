package defpackage;

import android.util.Xml;
import android.util.Xml.Encoding;
import java.io.IOException;
import org.xml.sax.SAXException;

/* renamed from: adct */
final class adct implements aebm {
    public adhw a = adhw.a(-2);
    private final String b;
    private final /* synthetic */ adcu c;

    adct(adcu adcu, String str) {
        this.c = adcu;
        this.b = str;
    }

    public final void a(xho xho) {
        int b = xho.b();
        String str;
        if (b == 404) {
            this.a = adhw.a(-1);
        } else if (b == 200) {
            xhn e = xho.e();
            if (e != null) {
                adcr adcr = new adcr();
                try {
                    Xml.parse(e.a(), Encoding.UTF_8, adcr);
                    int i = adcr.c;
                    if (i < 0) {
                        this.a = adhw.a(-2);
                        return;
                    }
                    adjb adjb = null;
                    if (adcr.a() != null) {
                        str = (String) adcr.f.get("theme");
                        if (str == null) {
                            str = "cl";
                        }
                        if (str.equals(this.c.b)) {
                            adjb = new adjb(adcr.a());
                        }
                    }
                    this.a = adhw.a().a(i).a(adcr.a).a(adcr.b).a(adjb).a(adcr.d).b(Boolean.parseBoolean((String) adcr.f.get("isInAppDial"))).c(adcr.e).a(adcr.f).a();
                    return;
                } catch (IOException | SAXException e2) {
                    String str2 = adcu.a;
                    str = String.valueOf(this.b);
                    String str3 = "Failed getting app status from ";
                    xtl.a(str2, str.length() == 0 ? new String(str3) : str3.concat(str), e2);
                    return;
                }
            }
            String.valueOf(this.b).length();
        } else {
            String str4 = adcu.a;
            str = this.b;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 61);
            stringBuilder.append("Request for TV app status from ");
            stringBuilder.append(str);
            stringBuilder.append(" got response code ");
            stringBuilder.append(b);
            xtl.a(str4, stringBuilder.toString());
            this.a = adhw.a(-2);
        }
    }

    public final void a(IOException iOException) {
        String str = adcu.a;
        String valueOf = String.valueOf(this.b);
        String str2 = "Failed getting app status from ";
        xtl.a(str, valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf), (Throwable) iOException);
    }
}
