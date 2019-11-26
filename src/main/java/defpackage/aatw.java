package defpackage;

import java.util.List;

/* renamed from: aatw */
public final class aatw extends aaml {
    public String a;
    public List b;

    public static String a(String str, List list) {
        StringBuilder stringBuilder = new StringBuilder();
        if (list != null) {
            for (Integer num : list) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(num);
            }
        }
        afkr afkr = new afkr();
        afkr.a("serviceName", "share/get_share_panel");
        afkr.a("serializedSharedEntity", str);
        afkr.a("installedSharingServiceIds", stringBuilder.toString());
        return afkr.a();
    }

    public aatw(aamd aamd, afpt afpt) {
        super("share/get_share_panel", aamd, afpt, aall.ENABLED);
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.a(this.a);
    }

    public final String a() {
        return aatw.a(this.a, this.b);
    }

    public final /* synthetic */ anzd c() {
        aseh aseh = (aseh) asee.e.createBuilder();
        String str = this.a;
        aseh.copyOnWrite();
        asee asee = (asee) aseh.instance;
        if (str != null) {
            asee.a |= 2;
            asee.c = str;
            List list = this.b;
            if (list != null) {
                aseh.copyOnWrite();
                asee = (asee) aseh.instance;
                if (!asee.d.a()) {
                    asee.d = anxl.mutableCopy(asee.d);
                }
                anvf.addAll(list, asee.d);
            }
            return aseh;
        }
        throw new NullPointerException();
    }
}
