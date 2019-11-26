package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.libraries.youtube.edit.gallery.MediaGridRecyclerView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: zpo */
public final class zpo extends nf {
    public ImageView Z;
    public int a;
    public FrameLayout aa;
    public zix ab;
    private MediaGridRecyclerView ac;
    private String ad = null;
    private boolean ae;
    public zpu b;
    public zpt c;

    public static zpo d(int i) {
        return zpo.a(i, false);
    }

    public static zpo a(int i, boolean z) {
        zpo zpo = new zpo();
        Bundle bundle = new Bundle();
        bundle.putInt("ARG_FILE_TYPE", i);
        bundle.putString("ARG_DIRECTORY_PATH", null);
        bundle.putBoolean("ARG_16_TO_9_RATIO", z);
        zpo.f(bundle);
        return zpo;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        bundle = this.j;
        this.a = bundle.getInt("ARG_FILE_TYPE");
        this.ad = bundle.getString("ARG_DIRECTORY_PATH");
        this.ae = bundle.getBoolean("ARG_16_TO_9_RATIO", false);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.media_grid_fragment, viewGroup, false);
        nn p = p();
        this.ac = (MediaGridRecyclerView) inflate.findViewById(R.id.media_grid_recycler_view);
        this.Z = (ImageView) inflate.findViewById(R.id.media_grid_zero_state_grid);
        this.aa = (FrameLayout) inflate.findViewById(R.id.media_grid_zero_state);
        this.ac.setFocusableInTouchMode(false);
        Parcelable parcelable = bundle != null ? bundle.getParcelable("layout_manager_state") : null;
        this.b = new zpu(p, ((wwz) p().getApplicationContext()).i().oA());
        apa apa = this.b;
        apa.f = this.ae;
        this.ac.a(apa);
        if (parcelable != null) {
            this.ac.n.a(parcelable);
        }
        this.ac.a(new zps(p));
        this.b.e = new zpr(this);
        return inflate;
    }

    public final void B() {
        super.B();
        f();
        zjc zjc = new zjc(p());
        List a = zjc.a(this.a);
        zix zix = this.ab;
        if (zix != null) {
            a.add(0, zix);
        }
        if (TextUtils.isEmpty(this.ad)) {
            this.b.a(a);
        } else {
            zpu zpu = this.b;
            int i = this.a;
            HashMap hashMap = new HashMap();
            for (zix zix2 : zjc.a(i)) {
                String d = zix2.d();
                if (hashMap.containsKey(d)) {
                    ((List) hashMap.get(d)).add(zix2);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(zix2);
                    hashMap.put(d, arrayList);
                }
            }
            zpu.a((List) hashMap.get(this.ad));
        }
        if (a.size() != 0) {
            this.aa.setVisibility(8);
            this.ac.setVisibility(0);
            return;
        }
        this.aa.setVisibility(4);
        View view = this.K;
        if (view != null) {
            view.post(new zpq(this, view));
        }
        this.ac.setVisibility(8);
    }

    public final void ad_() {
        super.ad_();
        MediaGridRecyclerView mediaGridRecyclerView = this.ac;
        int childCount = mediaGridRecyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = mediaGridRecyclerView.getChildAt(i);
            if (childAt instanceof zpz) {
                zpu.a((zpz) childAt);
            }
        }
    }

    public final void e(Bundle bundle) {
        bundle.putParcelable("layout_manager_state", this.ac.n.j());
    }

    public final void f() {
        amqw.a(this.b);
        if (this.ab != null) {
            zpu zpu = this.b;
            if (zpu.c.size() > 0) {
                zpu.d.b((zix) zpu.c.get(0));
                zpu.c(0);
            }
        }
    }
}
