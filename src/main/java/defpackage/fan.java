package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: fan */
public class fan {
    public ViewStub d;
    public boolean e = false;
    public View f;

    protected fan(ViewStub viewStub) {
        this.d = (ViewStub) amqw.a((Object) viewStub);
    }

    protected fan(View view) {
        this.f = (View) amqw.a((Object) view);
        this.e = true;
    }

    public final View b() {
        if (this.e) {
            return this.f;
        }
        this.f = this.d.inflate();
        this.e = true;
        return this.f;
    }

    public static void a(Context context, ViewGroup viewGroup, apdx[] apdxArr) {
        if (apdxArr != null) {
            viewGroup.removeAllViews();
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.intra_badge_padding);
            for (apdx apdx : apdxArr) {
                if (apdx != null) {
                    View view = null;
                    if ((apdx.a & 1) != 0) {
                        view = View.inflate(context, R.layout.standalone_ypc_badge, null);
                        far far = new far(view, 1);
                        aped aped = apdx.b;
                        if (aped == null) {
                            aped = aped.g;
                        }
                        far.a(aped);
                    }
                    if (view != null) {
                        LayoutParams layoutParams = new LayoutParams(-2, -2);
                        layoutParams.setMarginEnd(dimensionPixelSize);
                        viewGroup.addView(view, layoutParams);
                    }
                }
            }
        }
    }

    public static void a(Context context, ViewGroup viewGroup, List list) {
        fan.a(context, viewGroup, (apdx[]) list.toArray(new apdx[0]));
    }

    static Drawable a(Context context) {
        return (Drawable) xwe.a(context).a(new faq(context));
    }
}
