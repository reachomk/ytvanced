package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ProgressBar;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: hdf */
public final class hdf extends aito {
    public int a = 0;
    public int b;
    public String c;
    private YouTubeTextView d;
    private ProgressBar e;

    public hdf(Context context) {
        super(context);
    }

    public final View a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.remote_control_status, null);
        this.d = (YouTubeTextView) inflate.findViewById(R.id.message);
        this.e = (ProgressBar) inflate.findViewById(R.id.progressbar);
        return inflate;
    }

    public final void a(Context context, View view) {
        CharSequence string;
        xpr.a(this.d, this.a != 0);
        xpr.a(this.e, this.a == 2);
        YouTubeTextView youTubeTextView = this.d;
        if (TextUtils.isEmpty(this.c)) {
            string = context.getString(this.b);
        } else {
            string = context.getString(this.b, new Object[]{this.c});
        }
        youTubeTextView.setText(string);
    }

    public final void ag_() {
        this.a = 0;
        super.ag_();
    }

    public final boolean c() {
        return this.a != 0;
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }
}
