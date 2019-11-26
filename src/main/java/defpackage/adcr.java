package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* renamed from: adcr */
final class adcr extends DefaultHandler {
    public Uri a = null;
    public String b;
    public int c = -2;
    public boolean d = true;
    public boolean e = false;
    public final Map f = new HashMap();
    private final StringBuilder g = new StringBuilder();
    private boolean h;

    adcr() {
    }

    public final void startDocument() {
    }

    public final void characters(char[] cArr, int i, int i2) {
        this.g.append(cArr, i, i2);
    }

    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        StringBuilder stringBuilder = this.g;
        stringBuilder.delete(0, stringBuilder.length());
        str3 = "";
        if ("link".equals(str2)) {
            if ("run".equals(attributes.getValue(str3, "rel"))) {
                this.b = attributes.getValue(str3, "href");
            }
        } else if ("options".equals(str2)) {
            this.d = Boolean.parseBoolean(attributes.getValue(str3, "allowStop"));
        } else if ("additionalData".equals(str2)) {
            this.h = true;
        }
    }

    public final void endElement(String str, String str2, String str3) {
        if ("state".equals(str2)) {
            str = this.g.toString().toLowerCase(Locale.US);
            if (str.startsWith("installable")) {
                this.c = 0;
                this.a = Uri.parse(str.replace("installable = ", ""));
            } else if (str.equals("running")) {
                this.c = 1;
            } else if (str.equals("stopped")) {
                this.c = 2;
            } else if (str.equals("hidden")) {
                this.c = 3;
            }
        } else if ("additionalData".equals(str2)) {
            this.h = false;
        } else if ("discovery".equals(str2)) {
            if (Arrays.asList(this.g.toString().split(",")).contains("CastV2")) {
                this.e = true;
            }
        } else if (this.h) {
            this.f.put(str2, this.g.toString());
        }
    }

    public final String a() {
        return (String) this.f.get("screenId");
    }
}
