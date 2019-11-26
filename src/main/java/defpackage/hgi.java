package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.protos.youtube.api.innertube.ApplicationHelpEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ApplicationSettingsEndpointOuterClass;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.DownloadsPageEndpointOuterClass;
import com.google.protos.youtube.api.innertube.OfflineVideosEndpointOuterClass;
import java.util.HashSet;
import java.util.Set;

/* renamed from: hgi */
public final class hgi implements ebj, ejw {
    private final ebk a;
    private final fjg b;
    private final bcaa c;
    private final Set d = new HashSet();

    public hgi(ebk ebk, fjg fjg, bcaa bcaa) {
        this.a = ebk;
        this.b = fjg;
        this.c = bcaa;
        this.a.a((ebj) this);
    }

    public final void a(boolean z) {
        fiw a = this.b.a();
        if (a == null) {
            return;
        }
        if (gwd.i(a) || gwl.c(a)) {
            apxu a2 = a.a();
            if (a2 != null) {
                anxr access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
                a2.a(access$000);
                if (a2.h.a(access$000.d)) {
                    access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
                    a2.a(access$000);
                    Object b = a2.h.b(access$000.d);
                    if (b == null) {
                        b = access$000.b;
                    } else {
                        b = access$000.a(b);
                    }
                    if ("FElibrary".equals(((apge) b).b)) {
                        for (akot a3 : this.d) {
                            hgi.a(a3, z ^ 1);
                        }
                    }
                }
            }
        }
    }

    public final void a(akot akot) {
        a(akot, null);
    }

    public final void a(akot akot, apxu apxu) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(ApplicationHelpEndpointOuterClass.applicationHelpEndpoint);
            apxu.a(access$000);
            if (!apxu.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint);
                apxu.a(access$000);
                if (!apxu.h.a(access$000.d)) {
                    access$000 = anxl.checkIsLite(DownloadsPageEndpointOuterClass.downloadsPageEndpoint);
                    apxu.a(access$000);
                    if (!apxu.h.a(access$000.d)) {
                        access$000 = anxl.checkIsLite(OfflineVideosEndpointOuterClass.offlineVideosEndpoint);
                        apxu.a(access$000);
                        if (apxu.h.a(access$000.d) || ekc.a(apxu, this.c)) {
                            return;
                        }
                    }
                }
            }
        }
        this.d.add((akot) amqw.a((Object) akot));
        hgi.a(akot, this.a.a ^ 1);
    }

    public final void b(akot akot) {
        amqw.a((Object) akot);
        if (this.d.contains(akot)) {
            hgi.a(akot, true);
            this.d.remove(akot);
        }
    }

    private static void a(akot akot, boolean z) {
        View K_ = akot.K_();
        if (K_ != null) {
            K_.setEnabled(true);
            if (K_ instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) K_;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    viewGroup.getChildAt(i).setEnabled(true);
                }
            }
            K_.setAlpha(!z ? 0.4f : 1.0f);
        }
    }
}
