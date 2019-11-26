package defpackage;

import android.content.res.Resources.NotFoundException;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: pet */
class pet extends pgc {
    private final pew a;

    public pet(pgd pgd, pew pew) {
        super(pgd);
        this.a = pew;
    }

    public final peu a(int i) {
        try {
            return a(this.g.b.getResources().getXml(i));
        } catch (NotFoundException e) {
            c("inflate() called with unknown resourceId", e);
            return null;
        }
    }

    private final peu a(XmlResourceParser xmlResourceParser) {
        try {
            xmlResourceParser.next();
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (xmlResourceParser.getEventType() == 2) {
                    String toLowerCase = xmlResourceParser.getName().toLowerCase(Locale.US);
                    String str = "name";
                    String trim;
                    if (toLowerCase.equals("screenname")) {
                        toLowerCase = xmlResourceParser.getAttributeValue(null, str);
                        trim = xmlResourceParser.nextText().trim();
                        if (!(TextUtils.isEmpty(toLowerCase) || TextUtils.isEmpty(trim))) {
                            this.a.a();
                        }
                    } else if (toLowerCase.equals("string")) {
                        toLowerCase = xmlResourceParser.getAttributeValue(null, str);
                        trim = xmlResourceParser.nextText().trim();
                        if (!(TextUtils.isEmpty(toLowerCase) || trim == null)) {
                            this.a.a(toLowerCase, trim);
                        }
                    } else if (toLowerCase.equals("bool")) {
                        toLowerCase = xmlResourceParser.getAttributeValue(null, str);
                        trim = xmlResourceParser.nextText().trim();
                        if (!(TextUtils.isEmpty(toLowerCase) || TextUtils.isEmpty(trim))) {
                            try {
                                this.a.a(toLowerCase, Boolean.parseBoolean(trim));
                            } catch (NumberFormatException e) {
                                b("Error parsing bool configuration value", trim, e);
                            }
                        }
                    } else if (toLowerCase.equals("integer")) {
                        toLowerCase = xmlResourceParser.getAttributeValue(null, str);
                        trim = xmlResourceParser.nextText().trim();
                        if (!(TextUtils.isEmpty(toLowerCase) || TextUtils.isEmpty(trim))) {
                            try {
                                this.a.a(toLowerCase, Integer.parseInt(trim));
                            } catch (NumberFormatException e2) {
                                b("Error parsing int configuration value", trim, e2);
                            }
                        }
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException e3) {
            d("Error parsing tracker configuration file", e3);
        }
        return this.a.b();
    }
}
