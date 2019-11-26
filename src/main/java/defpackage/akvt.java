package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import com.google.protos.youtube.api.innertube.YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: akvt */
public class akvt implements akvo, OnClickListener, OnLongClickListener {
    public final akoc a;
    public final akpk b;
    public Object c;
    public acvx d;
    private final Context e;
    private final aafa f;
    private final aafd g;
    private final akwo h;
    private final Object i;
    private volatile aoa j;

    public akvt(Context context, aaas aaas, akvz akvz, akoe akoe) {
        this(context, aaas, akvz, akoe, null, null, null);
    }

    public akvt(Context context, aaas aaas, akvz akvz, akoe akoe, aafa aafa, aafd aafd, akwo akwo) {
        amqw.a((Object) aaas);
        amqw.a((Object) context);
        amqw.a((Object) akvz);
        this.e = context;
        akvz.a(auvj.class);
        this.a = akoe.a((akpb) akvz.get());
        this.b = new akpk();
        this.a.a(this.b);
        this.f = aafa;
        this.g = aafd;
        this.h = akwo;
        this.i = new Object();
        if (akvw.b == null) {
            akvw.b = new akvw();
        }
        akvw.b.a.put(this, null);
    }

    public final void onClick(View view) {
        auvn auvn = (auvn) view.getTag(R.id.innertube_menu_anchor_model);
        Object tag = view.getTag(R.id.innertube_menu_anchor_tag);
        Object tag2 = view.getTag(R.id.innertube_menu_anchor_interaction_logger);
        acvx acvx = tag2 instanceof acvx ? (acvx) tag2 : null;
        if (b(auvn, tag)) {
            a(auvn, view, tag, acvx);
        }
    }

    public final boolean onLongClick(View view) {
        auvn auvn = (auvn) view.getTag(R.id.innertube_menu_anchor_model);
        Object tag = view.getTag(R.id.innertube_menu_anchor_tag);
        Object tag2 = view.getTag(R.id.innertube_menu_anchor_interaction_logger);
        acvx acvx = tag2 instanceof acvx ? (acvx) tag2 : null;
        if (!b(auvn, tag)) {
            return false;
        }
        a(auvn, view, tag, acvx);
        return true;
    }

    public final Map a() {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.c);
        hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", this.d);
        return hashMap;
    }

    public final void a(View view, auvn auvn, Object obj, acvx acvx) {
        boolean b = b(auvn, obj);
        view.setVisibility(!b ? 8 : 0);
        view.setOnClickListener(this);
        view.setTag(R.id.innertube_menu_anchor_model, auvn);
        view.setTag(R.id.innertube_menu_anchor_tag, obj);
        view.setTag(R.id.innertube_menu_anchor_interaction_logger, acvx);
        if (b) {
            akwo akwo = this.h;
            if (akwo != null && !akwo.a.isEmpty()) {
                for (akwp b2 : akwo.a) {
                    b2.b(auvn, view);
                }
            }
        }
    }

    private final boolean b(auvn auvn, Object obj) {
        if (auvn != null) {
            for (auvj a : auvn.b) {
                if (!a(a).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(View view, View view2, auvn auvn, Object obj, acvx acvx) {
        amqw.a((Object) view);
        a(view2, auvn, obj, acvx);
        if (view2.getTag(R.id.innertube_menu_anchor_touch_handler) == null) {
            view2.setTag(R.id.innertube_menu_anchor_touch_handler, new akvu(view, view2));
        }
        if (b(auvn, obj) && auvn.e) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new akvs(this, view, auvn, view2, obj, acvx));
        }
    }

    public void a(auvn auvn, View view, Object obj, acvx acvx) {
        this.b.clear();
        this.b.addAll(a(auvn, obj));
        this.c = obj;
        this.d = acvx;
        aoa c = c();
        c.j = 8388661;
        c.m = view;
        c.f_();
    }

    /* Access modifiers changed, original: protected|final */
    public final aoa c() {
        if (this.j == null) {
            synchronized (this.i) {
                if (this.j == null) {
                    this.j = new aoa(this.e);
                    this.j.f = this.e.getResources().getDimensionPixelSize(R.dimen.innertube_menu_width);
                    this.j.l = 1;
                    this.j.h();
                    this.j.a(this.a);
                }
            }
        }
        return this.j;
    }

    public final void b() {
        synchronized (this.i) {
            if (this.j != null) {
                c().d();
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final List a(auvn auvn, Object obj) {
        ArrayList arrayList = new ArrayList();
        for (auvj a : auvn.b) {
            arrayList.addAll(a(a));
        }
        return arrayList;
    }

    private final amul a(auvj auvj) {
        Collection arrayList = new ArrayList();
        if (akvt.b(auvj) != 1) {
            aafa aafa = this.f;
            if (aafa != null) {
                int b = akvt.b(auvj);
                int i = b - 1;
                if (b == 0) {
                    throw null;
                } else if (aafa.a(i)) {
                    akvt.a((List) arrayList, auvj);
                }
            }
        } else {
            anxr access$000;
            aafd aafd;
            apxu d = abmk.d(auvj);
            if (d != null) {
                access$000 = anxl.checkIsLite(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint);
                d.a(access$000);
                if (d.h.a(access$000.d)) {
                    aafd = this.g;
                    if (aafd != null) {
                        arrayList.addAll(aafd.a(auvj));
                    }
                }
            }
            d = abmk.d(auvj);
            if (d != null) {
                access$000 = anxl.checkIsLite(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint);
                d.a(access$000);
                if (d.h.a(access$000.d)) {
                    aafd = this.g;
                    if (aafd != null) {
                        akvt.a((List) arrayList, aafd.b(auvj));
                    }
                }
            }
            d = abmk.d(auvj);
            if (d != null) {
                access$000 = anxl.checkIsLite(YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.ypcGetOfflineUpsellEndpoint);
                d.a(access$000);
                if (d.h.a(access$000.d)) {
                    aafd aafd2 = this.g;
                    if (aafd2 != null) {
                        akvt.a((List) arrayList, aafd2.a());
                    }
                }
            }
            akvt.a((List) arrayList, auvj);
        }
        return amul.a(arrayList);
    }

    private static void a(List list, auvj auvj) {
        if (auvj != null) {
            list.add(auvj);
        }
    }

    private static int b(auvj auvj) {
        int i = auvj.a;
        int a;
        if ((i & 8) != 0) {
            auvd auvd = auvj.e;
            if (auvd == null) {
                auvd = auvd.g;
            }
            a = auvz.a(auvd.f);
            if (a == 0) {
                return 1;
            }
            return a;
        } else if ((i & 16) == 0) {
            return 1;
        } else {
            auvf auvf = auvj.f;
            if (auvf == null) {
                auvf = auvf.g;
            }
            a = auvz.a(auvf.f);
            if (a == 0) {
                return 1;
            }
            return a;
        }
    }
}
