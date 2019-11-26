package defpackage;

import com.google.protos.youtube.api.innertube.YpcOffersEndpoint$YPCOffersEndpoint;

/* renamed from: abmf */
public final class abmf extends aaml {
    public String a;
    private String b;

    public final abmf a(YpcOffersEndpoint$YPCOffersEndpoint ypcOffersEndpoint$YPCOffersEndpoint) {
        amqw.a((Object) ypcOffersEndpoint$YPCOffersEndpoint);
        this.b = aali.b(ypcOffersEndpoint$YPCOffersEndpoint.b);
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        xvd.a(((atqg) ((anxl) n().build())).c);
    }

    private final atqf n() {
        atqf atqf = (atqf) atqg.e.createBuilder();
        String str = this.b;
        atqf.copyOnWrite();
        atqg atqg = (atqg) atqf.instance;
        if (str != null) {
            atqg.a |= 2;
            atqg.c = str;
            str = this.a;
            atqf.copyOnWrite();
            atqg = (atqg) atqf.instance;
            if (str != null) {
                atqg.a |= 4;
                atqg.d = str;
                return atqf;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    public final String a() {
        afkr k = k();
        k.a("itemParams", this.b);
        String str = this.a;
        if (str != null) {
            k.a("couponCode", str);
        }
        return k.a();
    }

    public final /* synthetic */ anzd c() {
        return n();
    }

    /* synthetic */ abmf(aamd aamd, afpt afpt) {
        super("ypc/get_offers", aamd, afpt);
        String str = "";
        this.b = str;
        this.a = str;
        a(aall.ENABLED);
    }
}
