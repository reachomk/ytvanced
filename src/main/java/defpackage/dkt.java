package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.edit.activity.ReelCameraActivity;
import com.google.protos.youtube.api.innertube.AddToToastActionOuterClass$AddToToastAction;
import com.google.protos.youtube.api.innertube.CreationReelPickerEndpointOuterClass$CreationReelPickerEndpoint;
import com.google.protos.youtube.api.innertube.MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint;
import com.google.protos.youtube.api.innertube.OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint;
import com.google.protos.youtube.api.innertube.ReelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint;
import com.google.protos.youtube.api.innertube.ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint;
import com.google.protos.youtube.api.innertube.UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint;

/* renamed from: dkt */
final class dkt implements gbc {
    public final xey a;
    public volatile ageb b;
    public volatile gbf c;
    public volatile abit d;
    public volatile Object e = new baqe();
    public volatile bcaa f;
    public volatile Object g = new baqe();
    public volatile bcaa h;
    public volatile Object i = new baqe();
    public volatile bcaa j;
    public volatile bcaa k;
    public final /* synthetic */ diu l;
    private volatile bcaa m;
    private volatile bcaa n;
    private volatile bcaa o;
    private volatile bcaa p;
    private volatile bcaa q;
    private volatile bcaa r;
    private volatile Object s = new baqe();
    private volatile bcaa t;

    public final acxj a() {
        return new acxj(this.l.oG(), this.l.oC(), this.l.p(), this.l.q(), this.l.jW(), this.l.r());
    }

    public final nt b() {
        return (nt) baqd.a(((ReelCameraActivity) xex.a(this.a)).g.s(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final aaas c() {
        Object obj = this.s;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.s;
                if (obj2 instanceof baqe) {
                    amuu a = amur.a(7);
                    Class cls = OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.class;
                    Object obj3 = this.m;
                    if (obj3 == null) {
                        obj3 = new dlf(this, 0);
                        this.m = obj3;
                    }
                    a = a.b(cls, obj3).b(AddToToastActionOuterClass$AddToToastAction.class, this.l.jZ());
                    cls = ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.class;
                    obj3 = this.n;
                    if (obj3 == null) {
                        obj3 = new dlf(this, 1);
                        this.n = obj3;
                    }
                    a = a.b(cls, obj3);
                    cls = MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint.class;
                    obj3 = this.o;
                    if (obj3 == null) {
                        obj3 = new dlf(this, 2);
                        this.o = obj3;
                    }
                    a = a.b(cls, obj3);
                    cls = ReelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint.class;
                    obj3 = this.p;
                    if (obj3 == null) {
                        obj3 = new dlf(this, 3);
                        this.p = obj3;
                    }
                    a = a.b(cls, obj3);
                    cls = CreationReelPickerEndpointOuterClass$CreationReelPickerEndpoint.class;
                    obj3 = this.q;
                    if (obj3 == null) {
                        obj3 = new dlf(this, 4);
                        this.q = obj3;
                    }
                    a = a.b(cls, obj3);
                    cls = UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint.class;
                    obj3 = this.r;
                    if (obj3 == null) {
                        obj3 = new dlf(this, 5);
                        this.r = obj3;
                    }
                    obj2 = new egw(new aaak(a.b(cls, obj3).b()), this.l.ff());
                    this.s = bapx.a(this.s, obj2);
                }
            }
            obj = obj2;
        }
        return (aaas) obj;
    }

    public final acwa d() {
        return (acwa) baqd.a((acwa) xex.a(this.a), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final bcaa e() {
        bcaa bcaa = this.t;
        if (bcaa != null) {
            return bcaa;
        }
        dlf dlf = new dlf(this, 7);
        this.t = dlf;
        return dlf;
    }

    public final gcu f() {
        return new dks(this);
    }

    public final void a(ReelCameraActivity reelCameraActivity) {
        reelCameraActivity.h = a();
    }

    /* synthetic */ dkt(diu diu, xey xey) {
        this.l = diu;
        this.a = xey;
    }
}
