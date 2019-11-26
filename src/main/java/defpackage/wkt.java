package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.regex.Pattern;

/* renamed from: wkt */
public final class wkt {
    private static final Pattern s = Pattern.compile("^\\s*$");
    private static final Pattern t = Pattern.compile("^\\s*");
    private static final Pattern u = Pattern.compile("\\s*$");
    public final Dialog a;
    public final Context b;
    public final akkl c;
    public final EditText d;
    public final ImageView e;
    public final TextView f;
    public final TextView g;
    public final View h;
    public final TextView i;
    public final View j;
    public final ImageView k;
    public final ImageView l;
    public final View m;
    public String n;
    public final ColorDrawable o;
    public Runnable p;
    public wla q;
    public boolean r;
    private String v = "";
    private boolean w;

    public wkt(Context context, akkl akkl) {
        this.b = (Context) amqw.a((Object) context);
        this.c = (akkl) amqw.a((Object) akkl);
        this.o = new ColorDrawable(xwe.a(context, R.attr.ytGeneralBackgroundA, 0));
        View inflate = LayoutInflater.from(context).inflate(R.layout.comment_dialog, null, false);
        this.e = (ImageView) inflate.findViewById(R.id.send_button);
        View findViewById = inflate.findViewById(R.id.progress_bar);
        this.k = (ImageView) inflate.findViewById(R.id.profile_photo);
        EditText editText = (EditText) inflate.findViewById(R.id.comment);
        editText.addTextChangedListener(new wlw());
        editText.addTextChangedListener(new wkx(this, editText));
        editText.post(new wky(this));
        this.d = editText;
        this.f = (TextView) inflate.findViewById(R.id.header_text);
        this.g = (TextView) inflate.findViewById(R.id.caption_text);
        this.h = inflate.findViewById(R.id.caption_divider);
        this.i = (TextView) inflate.findViewById(R.id.footer_text);
        this.j = inflate.findViewById(R.id.footer_divider);
        this.m = inflate.findViewById(R.id.actions);
        this.l = (ImageView) inflate.findViewById(R.id.video_reply_button);
        this.l.setEnabled(true);
        this.l.setOnClickListener(new wkw(this));
        this.a = new Builder(context).setView(inflate).create();
        this.e.setOnClickListener(new wkv(this, findViewById));
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        String obj = c().toString();
        return TextUtils.isEmpty(obj) || s.matcher(obj).find();
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        int a;
        if (TextUtils.isEmpty(this.v)) {
            a = a();
        } else {
            String str = "";
            a = c().toString().replaceAll(t.toString(), str).replaceAll(u.toString(), str).equals(this.v);
        }
        return a ^ 1;
    }

    public final void a(CharSequence charSequence, boolean z) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.d.getText().clear();
            this.d.append(charSequence);
            z = z && !a();
            a(z);
            String str = "";
            if (this.r) {
                this.v = str;
            } else {
                this.v = charSequence.toString();
                this.v = this.v.replaceAll(t.toString(), str);
                this.v = this.v.replaceAll(u.toString(), str);
            }
            wlt[] wltArr = (wlt[]) this.d.getText().getSpans(0, this.d.getText().length(), wlt.class);
            if (wltArr == null || wltArr.length == 0) {
                this.d.getText().setSpan(new wlt(), 0, this.d.getText().length(), 18);
            }
        }
    }

    public final Spanned c() {
        EditText editText = this.d;
        if (editText == null) {
            return new SpannedString("");
        }
        return new SpannedString(editText.getText());
    }

    public final void d() {
        if (!this.w) {
            this.a.dismiss();
            this.w = true;
        }
    }

    public final void a(boolean z) {
        this.r = z;
        this.e.setVisibility(!z ? 4 : 0);
    }
}
