package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: abvg */
public final class abvg implements akot, wxg {
    private final Handler a;
    private final Resources b;
    private final abrz c;
    private final View d;
    private final ImageView e = ((ImageView) this.d.findViewById(R.id.character_backstory_image));
    private final TextView f = ((TextView) this.d.findViewById(R.id.character_name));
    private final TextView g = ((TextView) this.d.findViewById(R.id.character_description));
    private final aklt h;
    private final int i = this.b.getDimensionPixelOffset(R.dimen.live_chat_paid_sticker_backstory_height);

    public abvg(Context context, abrz abrz, aklt aklt, Handler handler) {
        this.c = abrz;
        this.h = aklt;
        this.a = handler;
        this.b = context.getResources();
        this.d = View.inflate(context, R.layout.super_sticker_pack_backstory, null);
    }

    public final View K_() {
        return this.d;
    }

    public final void a(akpb akpb) {
        this.f.setText(null);
        this.g.setText(null);
        this.h.a(this.e);
        this.d.setBackground(null);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        arml arml2;
        axyr axyr = (axyr) obj;
        Uri uri = null;
        if ((axyr.a & 8) != 0) {
            arml = axyr.e;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        Spanned a = ajqy.a(arml);
        if (!TextUtils.isEmpty(a)) {
            this.f.setText(a);
        }
        if ((axyr.a & 16) != 0) {
            arml2 = axyr.f;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        Spanned a2 = ajqy.a(arml2);
        if (!TextUtils.isEmpty(a2)) {
            this.g.setText(a2);
            View view = this.d;
            String valueOf = String.valueOf(a);
            String valueOf2 = String.valueOf(a2);
            StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 1) + valueOf2.length());
            stringBuilder.append(valueOf);
            stringBuilder.append(" ");
            stringBuilder.append(valueOf2);
            view.setContentDescription(stringBuilder.toString());
        }
        if ((axyr.a & 1) != 0) {
            aklt aklt = this.h;
            ImageView imageView = this.e;
            aygk aygk = axyr.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
            aklt.a(imageView, aygk);
        }
        aygk aygk2 = axyr.c;
        if (aygk2 == null) {
            aygk2 = aygk.f;
        }
        if (aklb.a(aygk2)) {
            if (this.c == abrz.DARK && (axyr.a & 4) != 0) {
                aygk2 = axyr.d;
                if (aygk2 == null) {
                    aygk2 = aygk.f;
                }
            } else {
                aygk2 = axyr.c;
                if (aygk2 == null) {
                    aygk2 = aygk.f;
                }
            }
            aygm a3 = aklb.a(aygk2, Integer.MAX_VALUE, this.i);
            if (a3 != null) {
                uri = xvt.d(a3.b);
            }
            this.h.b(uri, wxl.a(this.a, this));
        }
    }
}
