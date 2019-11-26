package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.youtube.R;

/* renamed from: kcf */
public final class kcf implements akot {
    private final kmu a;
    private final kdp b;
    private kmt c;
    private kdk d;
    private akot e;
    private final ViewGroup f;

    public kcf(Context context, kmu kmu, kdp kdp) {
        this.a = (kmu) amqw.a((Object) kmu);
        this.b = (kdp) amqw.a((Object) kdp);
        this.f = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.drawer_list, null);
    }

    public final View K_() {
        return this.f;
    }

    public final void a(akpb akpb) {
        kdk kdk = this.d;
        if (kdk != null) {
            kdk.a(akpb);
        }
        kmt kmt = this.c;
        if (kmt != null) {
            kmt.a(akpb);
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        akor akor2 = akor;
        Object obj2 = (axeg) obj;
        amqw.a(obj2);
        akot akot = this.e;
        if (akot != null) {
            akot.K_().setVisibility(8);
        }
        ViewGroup viewGroup;
        if (akor2.a("is_horizontal_drawer_context", false)) {
            if (this.d == null) {
                viewGroup = (ViewGroup) ((ViewStub) this.f.findViewById(R.id.horizontal_drawer_stub)).inflate();
                kdp kdp = this.b;
                kdk kdk = r11;
                kdk kdk2 = new kdk((Context) kdp.a((Context) kdp.a.get(), 1), (akvz) kdp.a((akvz) kdp.b.get(), 2), (aaas) kdp.a((aaas) kdp.c.get(), 3), (akpe) kdp.a((akpe) kdp.d.get(), 4), (ViewGroup) kdp.a(viewGroup, 5));
                this.d = kdk;
            }
            this.e = this.d;
        } else {
            if (this.c == null) {
                viewGroup = (ViewGroup) ((ViewStub) this.f.findViewById(R.id.vertical_drawer_stub)).inflate();
                kmu kmu = this.a;
                kmt kmt = r11;
                kmt kmt2 = new kmt((Context) kmu.a((Context) kmu.a.get(), 1), (akvp) kmu.a((akvp) kmu.b.get(), 2), (akvz) kmu.a((akvz) kmu.c.get(), 3), (esh) kmu.a((esh) kmu.d.get(), 4), (akpe) kmu.a((akpe) kmu.e.get(), 5), (ViewGroup) kmu.a(viewGroup, 6));
                this.c = kmt;
            }
            this.e = this.c;
        }
        this.e.a_(akor2, obj2);
        this.e.K_().setVisibility(0);
    }
}
