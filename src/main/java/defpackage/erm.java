package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: erm */
final class erm {
    public final View a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;
    public final ImageView e;
    public final ImageView f;
    public final Button g;
    public final /* synthetic */ erk h;

    public erm(erk erk, View view) {
        this.h = erk;
        this.a = view;
        this.b = (TextView) view.findViewById(R.id.title);
        this.c = (TextView) view.findViewById(R.id.body_text);
        this.d = (ImageView) view.findViewById(R.id.dismiss_button);
        this.d.setOnClickListener(new erl(this));
        this.e = (ImageView) view.findViewById(R.id.background_image);
        this.f = (ImageView) view.findViewById(R.id.foreground_image);
        this.g = (Button) view.findViewById(R.id.action_button);
        this.g.setOnClickListener(new ero(this));
    }
}
