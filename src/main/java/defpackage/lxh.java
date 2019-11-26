package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.google.protos.youtube.api.innertube.SharePlaylistEndpointOuterClass$SharePlaylistEndpoint;

/* renamed from: lxh */
public final /* synthetic */ class lxh {
    public static aaap a(Activity activity, lye lye) {
        return new lxw(lye, activity);
    }

    static /* synthetic */ Intent b(nn nnVar, apxu apxu) {
        anxr access$000 = anxl.checkIsLite(SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.sharePlaylistEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        SharePlaylistEndpointOuterClass$SharePlaylistEndpoint sharePlaylistEndpointOuterClass$SharePlaylistEndpoint = (SharePlaylistEndpointOuterClass$SharePlaylistEndpoint) b;
        return xuz.d(nnVar, sharePlaylistEndpointOuterClass$SharePlaylistEndpoint.c, Uri.parse(sharePlaylistEndpointOuterClass$SharePlaylistEndpoint.b));
    }
}
