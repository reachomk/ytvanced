package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: yjr */
public final class yjr extends nd {
    public ysf Z;
    public yji aa;
    private ysb ab;

    public final void a(nt ntVar, String str) {
        super.a(ntVar, null);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((yjw) xse.a(p())).a(new yjv()).a(this);
    }

    public final Dialog a(Bundle bundle) {
        View inflate = p().getLayoutInflater().inflate(R.layout.edit_chat_name_dialog, null, false);
        if (inflate != null) {
            yzw yzw = new yzw(inflate);
            ysf ysf = this.Z;
            yjf a = this.aa.a();
            String string = this.j.getString("key");
            String string2 = this.j.getString("header_key");
            Context context = (Context) ysf.a((Context) ysf.a.get(), 1);
            ywk ywk = (ywk) ysf.a((ywk) ysf.b.get(), 2);
            xoi xoi = (xoi) ysf.a((xoi) ysf.c.get(), 3);
            Handler handler = (Handler) ysf.a((Handler) ysf.d.get(), 4);
            yjf yjf = (yjf) ysf.a(a, 5);
            String str = (String) ysf.a(string, 6);
            String str2 = (String) ysf.a(string2, 7);
            ysb ysb = r7;
            yzw yzw2 = (yzw) ysf.a(yzw, 8);
            ysb ysb2 = new ysb(context, ywk, xoi, handler, yjf, str, str2, yzw2, (ysg) ysf.a(new yju(this), 9));
            this.ab = ysb;
            this.ab.bk_();
            aeg aeg = new aeg(p(), R.style.EditChatNameDialog);
            aeg.a(yzw.a);
            aeg.a(R.string.positive_edit_chat_name_dialog_button, new yzz(yzw));
            aeg.b(R.string.negative_edit_chat_name_dialog_button, new yzy(yzw));
            aeh a2 = aeg.a();
            a2.getWindow().setSoftInputMode(4);
            return a2;
        }
        throw new NullPointerException("@AutoFactory method argument is null but is not marked @Nullable. Argument index: 1");
    }

    public final void i() {
        super.i();
        this.ab.bl_();
        this.ab = null;
    }
}
