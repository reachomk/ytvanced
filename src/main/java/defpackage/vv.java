package defpackage;

import android.app.Notification.DecoratedMediaCustomViewStyle;
import android.os.Build.VERSION;
import android.widget.RemoteViews;
import com.google.android.youtube.R;

/* renamed from: vv */
public final class vv extends vu {
    /* Access modifiers changed, original: final */
    public final int a(int i) {
        return i <= 3 ? R.layout.notification_template_big_media_narrow_custom : R.layout.notification_template_big_media_custom;
    }

    public final void a(qd qdVar) {
        if (VERSION.SDK_INT >= 24) {
            ((qi) qdVar).a.setStyle(a(new DecoratedMediaCustomViewStyle()));
        } else {
            super.a(qdVar);
        }
    }

    public final RemoteViews a() {
        if (VERSION.SDK_INT < 24) {
            RemoteViews remoteViews = this.b.v;
            Object obj = remoteViews == null ? null : 1;
            if (VERSION.SDK_INT < 21) {
                remoteViews = d();
                if (obj != null) {
                    a(remoteViews, this.b.v);
                    return remoteViews;
                }
            } else if (!(remoteViews == null && this.b.w == null)) {
                remoteViews = d();
                if (obj != null) {
                    a(remoteViews, this.b.v);
                }
                a(remoteViews);
                return remoteViews;
            }
        }
        return null;
    }

    /* Access modifiers changed, original: final */
    public final int e() {
        return this.b.v == null ? R.layout.notification_template_media : R.layout.notification_template_media_custom;
    }

    public final RemoteViews b() {
        if (VERSION.SDK_INT < 24) {
            qg qgVar = this.b;
            RemoteViews remoteViews = qgVar.w;
            if (remoteViews == null) {
                remoteViews = qgVar.v;
            }
            if (remoteViews != null) {
                RemoteViews f = f();
                a(f, remoteViews);
                if (VERSION.SDK_INT >= 21) {
                    a(f);
                }
                return f;
            }
        }
        return null;
    }

    public final RemoteViews c() {
        RemoteViews remoteViews = null;
        if (VERSION.SDK_INT < 24) {
            RemoteViews remoteViews2 = this.b.v;
            if (remoteViews2 != null) {
                remoteViews = f();
                a(remoteViews, remoteViews2);
                if (VERSION.SDK_INT >= 21) {
                    a(remoteViews);
                }
            }
        }
        return remoteViews;
    }

    private final void a(RemoteViews remoteViews) {
        qg qgVar = this.b;
        int i = qgVar.t;
        if (i == 0) {
            i = qgVar.a.getResources().getColor(R.color.notification_material_background_media_default_color);
        }
        remoteViews.setInt(R.id.status_bar_latest_event_content, "setBackgroundColor", i);
    }
}
