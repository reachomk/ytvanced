package defpackage;

import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;

/* renamed from: hoa */
final class hoa {
    public String a;
    public arml b;
    public aygk c;
    public awkv d;
    public arml e;
    public arml f;
    public apxu g;
    public artk h;

    private hoa() {
    }

    public static apxu a(String str) {
        apgd apgd = (apgd) apge.j.createBuilder();
        apgd.a(str);
        apge apge = (apge) ((anxl) apgd.build());
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(BrowseEndpointOuterClass.browseEndpoint, apge);
        return (apxu) ((anxl) apxx.build());
    }

    /* synthetic */ hoa(byte b) {
    }
}
