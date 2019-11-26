package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kww */
public final class kww implements akot {
    public awgz a;
    private final View b;
    private final TextView c = ((TextView) this.b.findViewById(R.id.title));
    private final ImageView d = ((ImageView) this.b.findViewById(R.id.icon));
    private final CheckBox e = ((CheckBox) this.b.findViewById(R.id.checkbox));

    public kww(Activity activity, aaas aaas, kwy kwy, ViewGroup viewGroup) {
        amqw.a((Object) activity);
        amqw.a((Object) aaas);
        amqw.a((Object) viewGroup);
        this.b = activity.getLayoutInflater().inflate(R.layout.playlist_add_to_entry, viewGroup, false);
        this.b.setOnClickListener(new kwz(this, aaas, kwy));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.b;
    }

    public final void b() {
        CheckBox checkBox = this.e;
        int a = awhb.a(this.a.e);
        boolean z = true;
        if (a == 0) {
            a = 1;
        }
        if (a != 4) {
            z = false;
        }
        checkBox.setChecked(z);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        awgz awgz = (awgz) obj;
        this.a = awgz;
        TextView textView = this.c;
        if ((awgz.a & 2) != 0) {
            arml = awgz.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        int a = awhb.a(awgz.e);
        if (a == 0 || a == 1) {
            this.e.setVisibility(8);
            this.d.setVisibility(0);
            if (awgz.b.equals("WL")) {
                this.d.setImageResource(R.drawable.ic_drawer_watch_later_normal);
                return;
            } else {
                this.d.setImageResource(R.drawable.quantum_ic_playlist_play_grey600_24);
                return;
            }
        }
        this.d.setVisibility(8);
        this.e.setVisibility(0);
        b();
    }
}
