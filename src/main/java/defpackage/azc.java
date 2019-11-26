package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.AsyncTask;
import androidx.mediarouter.app.MediaRouteButton;

/* renamed from: azc */
public final class azc extends AsyncTask {
    private final int a;
    private final Context b;
    private final /* synthetic */ MediaRouteButton c;

    public azc(MediaRouteButton mediaRouteButton, int i, Context context) {
        this.c = mediaRouteButton;
        this.a = i;
        this.b = context;
    }

    private final void a(Drawable drawable) {
        if (drawable != null) {
            MediaRouteButton.a.put(this.a, drawable.getConstantState());
        }
        this.c.b = null;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onCancelled(Object obj) {
        a((Drawable) obj);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            a(drawable);
        } else {
            ConstantState constantState = (ConstantState) MediaRouteButton.a.get(this.a);
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            this.c.b = null;
        }
        this.c.b(drawable);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return ((ConstantState) MediaRouteButton.a.get(this.a)) == null ? this.b.getResources().getDrawable(this.a) : null;
    }
}
