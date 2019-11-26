package defpackage;

import android.net.Uri;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;

/* renamed from: aaax */
public final class aaax {
    public static apxu a(Uri uri) {
        apxx apxx = (apxx) apxu.d.createBuilder();
        anxr anxr = UrlEndpointOuterClass.urlEndpoint;
        ayvn ayvn = (ayvn) ayvl.d.createBuilder();
        ayvn.a(uri.toString());
        apxx.a(anxr, (ayvl) ((anxl) ayvn.build()));
        return (apxu) ((anxl) apxx.build());
    }

    public static apxu a(String str) {
        apgd apgd = (apgd) apge.j.createBuilder();
        apgd.a(str);
        apge apge = (apge) ((anxl) apgd.build());
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(BrowseEndpointOuterClass.browseEndpoint, apge);
        return (apxu) ((anxl) apxx.build());
    }

    public static apxu b(String str) {
        apgd apgd = (apgd) apge.j.createBuilder();
        apgd.a(str);
        apgd.copyOnWrite();
        apge apge = (apge) apgd.instance;
        apge.a |= 16;
        apge.e = true;
        apge = (apge) ((anxl) apgd.build());
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(BrowseEndpointOuterClass.browseEndpoint, apge);
        return (apxu) ((anxl) apxx.build());
    }

    public static apxu a(byte[] bArr) {
        apxx apxx = (apxx) apxu.d.createBuilder();
        if (bArr != null) {
            try {
                apxx.mergeFrom(bArr, anxa.c());
            } catch (anyg unused) {
            }
        }
        return (apxu) ((anxl) apxx.build());
    }

    public static apxu b(byte[] bArr) {
        if (bArr != null) {
            try {
                return (apxu) anxl.parseFrom(apxu.d, bArr, anxa.c());
            } catch (anyg unused) {
            }
        }
        return apxu.d;
    }
}
