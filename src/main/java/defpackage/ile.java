package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;

/* renamed from: ile */
public final class ile extends nd implements acwa, iky {
    public xwb Z;
    public ikx aa;
    public acvx ab;
    private iks ac;

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((ild) xse.a(p())).a(this);
        a(2, this.Z.a);
        this.ab.a(acwl.ar, null, null);
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        Object obj = this.ac;
        obj.a();
        obj.l.a(obj);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = (LoadingFrameLayout) layoutInflater.inflate(R.layout.suggested_playlist_videos_fragment, viewGroup, false);
        ikx ikx = this.aa;
        View view2 = view;
        iks iks = r3;
        iks iks2 = new iks(ikx.a, (xoi) ikx.a((xoi) ikx.b.get(), 2), (Context) ikx.a((Context) ikx.c.get(), 3), (Executor) ikx.a((Executor) ikx.d.get(), 4), (akzb) ikx.a((akzb) ikx.e.get(), 5), (akvz) ikx.a((akvz) ikx.f.get(), 6), (eod) ikx.a((eod) ikx.g.get(), 7), (fly) ikx.a((fly) ikx.h.get(), 8), (xci) ikx.a((xci) ikx.i.get(), 9), (acwa) ikx.a(this, 10), (LoadingFrameLayout) ikx.a(view, 11), (iky) ikx.a(this, 12));
        this.ac = iks;
        return view2;
    }

    public final void i() {
        super.i();
        iks iks = this.ac;
        iks.l.b(iks);
        iks.j.c();
    }

    public final void a() {
        dismiss();
    }

    public final Dialog a(Bundle bundle) {
        Dialog a = super.a(bundle);
        Window window = a.getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.SlideDownAnimation);
        }
        return a;
    }

    public final acvx t() {
        return this.ab;
    }
}
