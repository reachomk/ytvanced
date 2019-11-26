package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.Map;

/* renamed from: jva */
public final class jva implements aaap {
    public final jup a;
    private final acwa b;
    private final bcaa c;

    public jva(jup jup, acwa acwa, bcaa bcaa) {
        this.a = jup;
        this.b = acwa;
        this.c = bcaa;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.inlineMutedWatchEndpointMutationCommand);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            Object tag;
            access$000 = anxl.checkIsLite(InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.inlineMutedWatchEndpointMutationCommand);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            apxu = ((InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand) b).b;
            if (apxu == null) {
                apxu = apxu.d;
            }
            if (map != null) {
                View view = (View) map.get("com.google.android.libraries.youtube.rendering.elements.sender_view");
                if (view != null) {
                    view = jva.a(view);
                    if (view != null) {
                        map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY", view);
                        tag = view.getTag(R.id.elements_image);
                        if (tag instanceof bdhi) {
                            aygj aygj = (aygj) aygk.f.createBuilder();
                            for (bdhk bdhk : ((bdhi) tag).a) {
                                aygl aygl = (aygl) aygm.e.createBuilder();
                                String str = !bdhk.a().startsWith("//") ? "" : "https:";
                                String valueOf = String.valueOf(bdhk.a());
                                if (valueOf.length() == 0) {
                                    valueOf = new String(str);
                                } else {
                                    valueOf = str.concat(valueOf);
                                }
                                aygl.a(valueOf);
                                aygl.a(bdhk.b);
                                aygl.b(bdhk.c);
                                aygj.a(aygl);
                            }
                            tag = (aygk) ((anxl) aygj.build());
                        } else {
                            tag = null;
                        }
                        map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", tag);
                    }
                }
            }
            access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
            apxu.a(access$000);
            Object b2 = apxu.h.b(access$000.d);
            if (b2 == null) {
                tag = access$000.b;
            } else {
                tag = access$000.a(b2);
            }
            azje azje = (azje) tag;
            fpg k = fpd.k();
            k.g = 4;
            k.d = apxu;
            k.b = azje.b;
            fpd a = k.a();
            if (!this.a.a(a, (aaas) this.c.get(), this.b.t(), map, new jvd(this, a))) {
                ((aaas) this.c.get()).a(this.b.t().a(apxu), map);
            }
        }
    }

    private static View a(View view) {
        if (!(view.getTag(R.id.elements_image) instanceof bdhi)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View a = jva.a(viewGroup.getChildAt(i));
                    if (a != null) {
                        return a;
                    }
                }
            }
            view = null;
        }
        return view;
    }
}
