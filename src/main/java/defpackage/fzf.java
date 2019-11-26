package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.youtube.R;

/* renamed from: fzf */
public final class fzf implements akot {
    public final ProgressBar a = ((ProgressBar) this.f.findViewById(R.id.spinner));
    public fyo b;
    private final Button c = ((Button) this.f.findViewById(R.id.action_button));
    private final aklt d;
    private final ImageView e = ((ImageView) this.f.findViewById(R.id.display_image));
    private final View f;

    public fzf(Context context, aklt aklt) {
        this.d = aklt;
        this.f = View.inflate(context, R.layout.welcome_layout, null);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.f;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        fys fys = (fys) obj;
        this.b = (fyo) akor.a("sectionController");
        this.c.setOnClickListener(new fzi(this));
        aoxk aoxk = fys.a;
        int i = aoxk.b;
        String str = "";
        if (i != 3) {
            if (i == 4) {
                str = (String) aoxk.c;
            }
        } else if (i == 3) {
            str = (String) aoxk.c;
        }
        this.d.a(new fzh(this));
        this.d.a(this.e, Uri.parse(str));
    }
}
