package defpackage;

import android.app.Notification.MediaStyle;
import android.app.PendingIntent;
import android.media.session.MediaSession.Token;
import android.os.Build.VERSION;
import android.widget.RemoteViews;
import com.google.android.youtube.R;

/* renamed from: vu */
public class vu extends qj {
    public int[] a = null;
    public xo f;

    /* Access modifiers changed, original: 0000 */
    public int a(int i) {
        return i <= 3 ? R.layout.notification_template_big_media_narrow : R.layout.notification_template_big_media;
    }

    /* Access modifiers changed, original: 0000 */
    public int e() {
        return R.layout.notification_template_media;
    }

    public void a(qd qdVar) {
        if (VERSION.SDK_INT >= 21) {
            ((qi) qdVar).a.setStyle(a(new MediaStyle()));
        }
    }

    /* Access modifiers changed, original: final */
    public final MediaStyle a(MediaStyle mediaStyle) {
        int[] iArr = this.a;
        if (iArr != null) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
        xo xoVar = this.f;
        if (xoVar != null) {
            mediaStyle.setMediaSession((Token) xoVar.a);
        }
        return mediaStyle;
    }

    public RemoteViews a() {
        if (VERSION.SDK_INT >= 21) {
            return null;
        }
        return d();
    }

    /* Access modifiers changed, original: final */
    public final RemoteViews d() {
        RemoteViews a = a(e(), true);
        int size = this.b.b.size();
        int[] iArr = this.a;
        int min = iArr != null ? Math.min(iArr.length, 3) : 0;
        a.removeAllViews(R.id.media_actions);
        if (min > 0) {
            int i = 0;
            while (i < min) {
                if (i < size) {
                    a.addView(R.id.media_actions, a((qc) this.b.b.get(this.a[i])));
                    i++;
                } else {
                    throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(size - 1)}));
                }
            }
        }
        a.setViewVisibility(R.id.end_padder, 0);
        a.setViewVisibility(R.id.cancel_action, 8);
        return a;
    }

    private final RemoteViews a(qc qcVar) {
        PendingIntent pendingIntent = qcVar.i;
        RemoteViews remoteViews = new RemoteViews(this.b.a.getPackageName(), R.layout.notification_media_action);
        remoteViews.setImageViewResource(R.id.action0, qcVar.g);
        if (pendingIntent != null) {
            remoteViews.setOnClickPendingIntent(R.id.action0, qcVar.i);
        }
        remoteViews.setContentDescription(R.id.action0, qcVar.h);
        return remoteViews;
    }

    public RemoteViews b() {
        if (VERSION.SDK_INT >= 21) {
            return null;
        }
        return f();
    }

    /* Access modifiers changed, original: final */
    public final RemoteViews f() {
        int min = Math.min(this.b.b.size(), 5);
        int i = 0;
        RemoteViews a = a(a(min), false);
        a.removeAllViews(R.id.media_actions);
        if (min > 0) {
            while (i < min) {
                a.addView(R.id.media_actions, a((qc) this.b.b.get(i)));
                i++;
            }
        }
        a.setViewVisibility(R.id.cancel_action, 8);
        return a;
    }
}
