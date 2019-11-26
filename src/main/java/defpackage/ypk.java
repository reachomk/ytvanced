package defpackage;

import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: ypk */
final /* synthetic */ class ypk implements yiq {
    private final ypf a;

    ypk(ypf ypf) {
        this.a = ypf;
    }

    public final void a(amul amul) {
        boolean z;
        amul amul2;
        amuo amuo;
        List a;
        ypf ypf = this.a;
        if (ypf.q == null) {
            ypg ypg = ypf.o;
            ypf.q = new yoz((yil) ypg.a((yil) ypg.a.get(), 1), (ypn) ypg.a((ypn) ypg.b.get(), 2), (xsc) ypg.a((xsc) ypg.c.get(), 3), (yrz) ypg.a((yrz) ypg.d.get(), 4), (LayoutInflater) ypg.a(ypf.h, 5), (OnClickListener) ypg.a(new ypj(ypf), 6), (String) ypg.a(ypf.i, 7), (String) ypg.a(ypf.j, 8), (String) ypg.a(ypf.k, 9), (yty) ypg.a(ypf.l, 10), (ynv) ypg.a(ypf.m, 11), (yxm) ypg.a(ypf.g, 12), (ysa) ypg.a(ypf.p, 13));
            ypf.g.a(ypf.q);
            yoz yoz = ypf.q;
            String str = "ChatMessageSetPresenter.adapter";
            xvd.a(str);
            ypf.c();
            ypf.d.a(str, yoz);
            z = false;
        } else {
            z = true;
        }
        apsz apsz = (apsz) ypf.r.getEntity();
        if ((apsz.getPageToken().a & 1) == 0 || apsz.getPageToken().b.isEmpty()) {
            amul2 = amul;
        } else {
            boolean z2;
            amuo = new amuo();
            amuo.b(amul);
            boolean a2 = ykk.a(ypf.s);
            yml yml = ypf.s;
            if (yml == null || (yml.a & 2) == 0 || !yml.c) {
                z2 = false;
            } else {
                z2 = true;
            }
            amuo.c(new yla(a2, z2));
            amul2 = amuo.a();
        }
        CharSequence charSequence = ypf.u;
        String string = ypf.e_.getString(R.string.sending_receipt);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        amxn amxn = (amxn) amul2.listIterator();
        Object obj = null;
        while (amxn.hasNext()) {
            yki yki = (yki) amxn.next();
            if (yki instanceof ykt) {
                obj = yki;
            } else if (yki.b) {
                arrayList.add(yki);
            } else {
                arrayList2.add(yki);
            }
        }
        if (arrayList.isEmpty()) {
            int i;
            Collection a3 = ykm.a(arrayList2);
            int size = a3.size();
            do {
                i = size;
                if (i <= 0) {
                    i = 0;
                    break;
                }
                size = i - 1;
            } while (!(a3.get(size) instanceof ylf));
            if (i > 0) {
                a3.add(i, new yle(charSequence));
            }
            if (obj != null) {
                a3.add(obj);
            }
            a = amul.a(a3);
        } else {
            amuo = new amuo();
            amuo.b(ykm.a(arrayList2));
            amuo.b(ykm.a(arrayList));
            amuo.c(new yle(string));
            if (obj != null) {
                amuo.c(obj);
            }
            a = amuo.a();
        }
        boolean a4 = ypf.g.a();
        yoz yoz2 = ypf.q;
        if (yoz2.k == null) {
            yrz yrz = yoz2.f;
            yrv yrv = r10;
            yrv yrv2 = new yrv((Executor) yrz.a((Executor) yrz.a.get(), 1), (Executor) yrz.a((Executor) yrz.b.get(), 2), (apa) yrz.a(yoz2, 3), (List) yrz.a(yoz2.e, 4), (ysa) yrz.a(new ypc(yoz2), 5));
            yoz2.k = yrv;
            if (yoz2.d == null) {
                yil yil = yoz2.c;
                yoz2.d = yil.a(yoz2.l);
            }
            yoz2.d.a("diff_util_callback", yoz2.k);
        }
        yoz2.k.a(a, yoz2.h);
        if (a4) {
            ypf.g.a(z);
        }
    }
}
