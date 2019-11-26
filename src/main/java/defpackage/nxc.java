package defpackage;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: nxc */
public final class nxc {
    public static boolean a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean b(XmlPullParser xmlPullParser, String str) {
        return nxc.a(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean a(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }
}
