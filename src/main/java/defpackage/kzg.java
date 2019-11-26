package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.widget.ListView;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.youtube.R;

/* renamed from: kzg */
final class kzg implements alfl, kwy {
    public String a;
    public final akpk b = new akpk();
    public final /* synthetic */ kzb c;
    private Dialog d;
    private LoadingFrameLayout e;

    public kzg(kzb kzb) {
        this.c = kzb;
    }

    public final void c() {
        if (this.d == null) {
            this.e = (LoadingFrameLayout) this.c.a.getLayoutInflater().inflate(R.layout.add_to_dialog, null, false);
            ListView listView = (ListView) this.e.findViewById(R.id.lists);
            aknw aknw = new aknw();
            aknw.a(awgz.class, new kzh(this));
            aknw.a(aphg.class, new kzk(this, listView));
            akoc a = this.c.h.a(aknw);
            a.a(this.b);
            listView.setAdapter(a);
            listView.setOnItemClickListener(new kzj(this));
            AlertDialog create = new Builder(this.c.a).setView(this.e).create();
            arvt b = this.c.i.b();
            if (b != null) {
                aume aume = b.e;
                if (aume == null) {
                    aume = aume.af;
                }
                if (aume.G) {
                    create.setButton(-1, this.c.a.getString(R.string.rename_dialog_ok), new kzf(this));
                }
            }
            this.d = create;
        }
        abfm abfm = (abfm) this.c.c.get();
        abfz a2 = ((abfm) this.c.c.get()).a();
        a2.c(this.a);
        a2.g();
        afsw kzm = new kzm(this.c, this.b, this.e);
        this.e.a();
        this.e.a(new kzi(abfm, a2, kzm));
        abfm.a(a2, kzm);
        this.d.show();
    }

    public final void aa() {
        Dialog dialog = this.d;
        if (dialog != null && dialog.isShowing()) {
            this.d.hide();
        }
    }

    public final void d() {
        Dialog dialog = this.d;
        if (dialog != null && dialog.isShowing()) {
            this.d.dismiss();
        }
    }

    public final void a() {
        akpk akpk = this.b;
        for (int i = 0; i < akpk.size(); i++) {
            if (akpk.get(i) instanceof awgz) {
                int a = awhb.a(((awgz) akpk.get(i)).e);
                if (a != 0 && a == 4) {
                    return;
                }
            }
        }
        for (kzl a2 : this.c.j) {
            a2.a();
        }
    }

    public final void b() {
        d();
    }
}
