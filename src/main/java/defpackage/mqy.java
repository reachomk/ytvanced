package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.protos.youtube.api.innertube.ApplicationSettingsEndpointOuterClass;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.InlineUnmuteEndpointOuterClass;
import com.google.protos.youtube.api.innertube.MobileV2UserFeedEndpointOuterClass;
import com.google.protos.youtube.api.innertube.OfflineEndpointOuterClass;
import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SignInEndpointOuterClass;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchPlaylistEndpointOuterClass;
import java.util.List;
import java.util.Map;

/* renamed from: mqy */
public final class mqy implements aaas {
    private final Context a;
    private final aaas b;
    private final aaas c;

    public mqy(Context context, aaas aaas, aaas aaas2) {
        this.a = context;
        this.b = aaas;
        this.c = aaas2;
    }

    public final void a(List list, Object obj) {
        aaav.a((aaas) this, list, obj);
    }

    public final void a(List list, Map map) {
        aaav.a((aaas) this, list, map);
    }

    public final void a(apxu[] apxuArr, Object obj) {
        aaav.a((aaas) this, apxuArr, obj);
    }

    public final void a(apxu[] apxuArr, Map map) {
        aaav.a((aaas) this, apxuArr, map);
    }

    public final void a(apxu apxu, Map map) {
        if (apxu != null) {
            try {
                anxr access$000 = anxl.checkIsLite(ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint);
                apxu.a(access$000);
                if (apxu.h.a(access$000.d)) {
                    throw new mqx("Settings not supported");
                }
                access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
                apxu.a(access$000);
                if (apxu.h.a(access$000.d)) {
                    throw new mqx("Browse not supported");
                }
                access$000 = anxl.checkIsLite(InlineUnmuteEndpointOuterClass.inlineUnmuteEndpoint);
                apxu.a(access$000);
                if (apxu.h.a(access$000.d)) {
                    this.c.a(apxu, map);
                    return;
                }
                anxr access$0002 = anxl.checkIsLite(MobileV2UserFeedEndpointOuterClass.mobileV2UserFeedEndpoint);
                apxu.a(access$0002);
                if (apxu.h.a(access$0002.d)) {
                    throw new mqx("Feed not supported");
                }
                access$0002 = anxl.checkIsLite(OfflineEndpointOuterClass.offlineEndpoint);
                apxu.a(access$0002);
                if (apxu.h.a(access$0002.d)) {
                    throw new mqx("Offline not supported");
                }
                access$0002 = anxl.checkIsLite(OfflineWatchEndpointOuterClass.offlineWatchEndpoint);
                apxu.a(access$0002);
                if (apxu.h.a(access$0002.d)) {
                    throw new mqx("Offline Watch not supported");
                }
                access$0002 = anxl.checkIsLite(SearchEndpointOuterClass.searchEndpoint);
                apxu.a(access$0002);
                if (apxu.h.a(access$0002.d)) {
                    throw new mqx("Search not supported");
                }
                access$0002 = anxl.checkIsLite(SignInEndpointOuterClass.signInEndpoint);
                apxu.a(access$0002);
                if (apxu.h.a(access$0002.d)) {
                    throw new mqx("Sign in not supported");
                }
                access$0002 = anxl.checkIsLite(UrlEndpointOuterClass.urlEndpoint);
                apxu.a(access$0002);
                if (apxu.h.a(access$0002.d)) {
                    Context context = this.a;
                    access$000 = anxl.checkIsLite(UrlEndpointOuterClass.urlEndpoint);
                    apxu.a(access$000);
                    Object b = apxu.h.b(access$000.d);
                    if (b == null) {
                        b = access$000.b;
                    } else {
                        b = access$000.a(b);
                    }
                    wxk.b(context, Uri.parse(((ayvl) b).b));
                    return;
                }
                access$0002 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
                apxu.a(access$0002);
                if (apxu.h.a(access$0002.d)) {
                    this.b.a(apxu, null);
                    return;
                }
                access$0002 = anxl.checkIsLite(WatchPlaylistEndpointOuterClass.watchPlaylistEndpoint);
                apxu.a(access$0002);
                if (apxu.h.a(access$0002.d)) {
                    throw new mqx("Watch Playlist not supported");
                }
                throw new mqx("Unknown Navigation");
            } catch (mqx unused) {
            }
        }
    }
}
