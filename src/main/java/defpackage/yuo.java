package defpackage;

import com.google.protos.youtube.api.innertube.ShareEndpointOuterClass$ShareEntityEndpoint;

/* renamed from: yuo */
public final /* synthetic */ class yuo implements bbnw {
    private final yuh a;

    public yuo(yuh yuh) {
        this.a = yuh;
    }

    public final void accept(Object obj) {
        yuh yuh = this.a;
        axhp axhp = (axhp) ShareEndpointOuterClass$ShareEntityEndpoint.d.createBuilder();
        String shareToken = ((ylh) obj).getShareToken();
        axhp.copyOnWrite();
        ShareEndpointOuterClass$ShareEntityEndpoint shareEndpointOuterClass$ShareEntityEndpoint = (ShareEndpointOuterClass$ShareEntityEndpoint) axhp.instance;
        if (shareToken != null) {
            shareEndpointOuterClass$ShareEntityEndpoint.a |= 1;
            shareEndpointOuterClass$ShareEntityEndpoint.b = shareToken;
            ShareEndpointOuterClass$ShareEntityEndpoint shareEndpointOuterClass$ShareEntityEndpoint2 = (ShareEndpointOuterClass$ShareEntityEndpoint) ((anxl) axhp.build());
            apxx apxx = (apxx) apxu.d.createBuilder();
            apxx.a(ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint, shareEndpointOuterClass$ShareEntityEndpoint2);
            yuh.b.a((apxu) ((anxl) apxx.build()), null);
            return;
        }
        throw new NullPointerException();
    }
}
