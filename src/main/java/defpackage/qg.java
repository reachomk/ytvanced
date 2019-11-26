package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.RemoteViews;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* renamed from: qg */
public final class qg {
    public Notification A;
    @Deprecated
    public ArrayList B;
    private qj C;
    public Context a;
    public ArrayList b;
    public ArrayList c;
    public CharSequence d;
    public CharSequence e;
    public PendingIntent f;
    public Bitmap g;
    public CharSequence h;
    public int i;
    public boolean j;
    public CharSequence k;
    public int l;
    public int m;
    public boolean n;
    public String o;
    public boolean p;
    public boolean q;
    public String r;
    public Bundle s;
    public int t;
    public int u;
    public RemoteViews v;
    public RemoteViews w;
    public String x;
    public long y;
    public int z;

    public qg(Context context, String str) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.j = true;
        this.q = false;
        this.t = 0;
        this.u = 0;
        this.z = 0;
        this.A = new Notification();
        this.a = context;
        this.x = str;
        this.A.when = System.currentTimeMillis();
        this.A.audioStreamType = -1;
        this.i = 0;
        this.B = new ArrayList();
    }

    @Deprecated
    public qg(Context context) {
        this(context, null);
    }

    public final qg a(long j) {
        this.A.when = j;
        return this;
    }

    public final qg a(int i) {
        this.A.icon = i;
        return this;
    }

    public final qg a(CharSequence charSequence) {
        this.d = qg.f(charSequence);
        return this;
    }

    public final qg b(CharSequence charSequence) {
        this.e = qg.f(charSequence);
        return this;
    }

    public final qg c(CharSequence charSequence) {
        this.k = qg.f(charSequence);
        return this;
    }

    public final qg d(CharSequence charSequence) {
        this.h = qg.f(charSequence);
        return this;
    }

    public final qg a(int i, int i2, boolean z) {
        this.l = i;
        this.m = i2;
        this.n = z;
        return this;
    }

    public final qg a(PendingIntent pendingIntent) {
        this.A.deleteIntent = pendingIntent;
        return this;
    }

    public final qg e(CharSequence charSequence) {
        this.A.tickerText = qg.f(charSequence);
        return this;
    }

    public final qg a(Bitmap bitmap) {
        if (bitmap != null && VERSION.SDK_INT < 27) {
            Resources resources = this.a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double d = (double) dimensionPixelSize;
                double max = (double) Math.max(1, bitmap.getWidth());
                Double.isNaN(d);
                Double.isNaN(max);
                d /= max;
                max = (double) dimensionPixelSize2;
                double max2 = (double) Math.max(1, bitmap.getHeight());
                Double.isNaN(max);
                Double.isNaN(max2);
                double min = Math.min(d, max / max2);
                double width = (double) bitmap.getWidth();
                Double.isNaN(width);
                int ceil = (int) Math.ceil(width * min);
                max = (double) bitmap.getHeight();
                Double.isNaN(max);
                bitmap = Bitmap.createScaledBitmap(bitmap, ceil, (int) Math.ceil(max * min), true);
            }
        }
        this.g = bitmap;
        return this;
    }

    public final qg a(boolean z) {
        a(2, z);
        return this;
    }

    public final qg b(boolean z) {
        a(16, z);
        return this;
    }

    public final qg a() {
        this.q = true;
        return this;
    }

    private final void a(int i, boolean z) {
        Notification notification;
        if (z) {
            notification = this.A;
            notification.flags = i | notification.flags;
            return;
        }
        notification = this.A;
        notification.flags = (i ^ -1) & notification.flags;
    }

    public final Bundle b() {
        if (this.s == null) {
            this.s = new Bundle();
        }
        return this.s;
    }

    public final qg a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this.b.add(new qc(i, charSequence, pendingIntent));
        return this;
    }

    public final qg a(qc qcVar) {
        this.b.add(qcVar);
        return this;
    }

    public final qg a(qj qjVar) {
        if (this.C != qjVar) {
            this.C = qjVar;
            qjVar = this.C;
            if (!(qjVar == null || qjVar.b == this)) {
                qjVar.b = this;
                qg qgVar = qjVar.b;
                if (qgVar != null) {
                    qgVar.a(qjVar);
                }
            }
        }
        return this;
    }

    public final qg c() {
        this.u = 1;
        return this;
    }

    public final qg d() {
        this.z = 1;
        return this;
    }

    public final Notification e() {
        Notification build;
        qi qiVar = new qi(this);
        qj qjVar = qiVar.b.C;
        if (qjVar != null) {
            qjVar.a(qiVar);
        }
        RemoteViews a = qjVar != null ? qjVar.a() : null;
        RemoteViews remoteViews;
        if (VERSION.SDK_INT >= 26) {
            build = qiVar.a.build();
        } else if (VERSION.SDK_INT >= 24) {
            build = qiVar.a.build();
            if (qiVar.g != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || qiVar.g != 2)) {
                    qi.a(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && qiVar.g == 1) {
                    qi.a(build);
                }
            }
        } else if (VERSION.SDK_INT >= 21) {
            qiVar.a.setExtras(qiVar.f);
            build = qiVar.a.build();
            remoteViews = qiVar.c;
            if (remoteViews != null) {
                build.contentView = remoteViews;
            }
            remoteViews = qiVar.d;
            if (remoteViews != null) {
                build.bigContentView = remoteViews;
            }
            if (qiVar.g != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || qiVar.g != 2)) {
                    qi.a(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && qiVar.g == 1) {
                    qi.a(build);
                }
            }
        } else if (VERSION.SDK_INT >= 20) {
            qiVar.a.setExtras(qiVar.f);
            build = qiVar.a.build();
            remoteViews = qiVar.c;
            if (remoteViews != null) {
                build.contentView = remoteViews;
            }
            remoteViews = qiVar.d;
            if (remoteViews != null) {
                build.bigContentView = remoteViews;
            }
            if (qiVar.g != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || qiVar.g != 2)) {
                    qi.a(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && qiVar.g == 1) {
                    qi.a(build);
                }
            }
        } else {
            SparseArray a2 = ql.a(qiVar.e);
            if (a2 != null) {
                qiVar.f.putSparseParcelableArray("android.support.actionExtras", a2);
            }
            qiVar.a.setExtras(qiVar.f);
            build = qiVar.a.build();
            remoteViews = qiVar.c;
            if (remoteViews != null) {
                build.contentView = remoteViews;
            }
            remoteViews = qiVar.d;
            if (remoteViews != null) {
                build.bigContentView = remoteViews;
            }
        }
        if (a == null) {
            a = qiVar.b.v;
            if (a != null) {
                build.contentView = a;
            }
        } else {
            build.contentView = a;
        }
        if (VERSION.SDK_INT >= 16 && qjVar != null) {
            a = qjVar.b();
            if (a != null) {
                build.bigContentView = a;
            }
        }
        if (VERSION.SDK_INT >= 21 && qjVar != null) {
            RemoteViews c = qiVar.b.C.c();
            if (c != null) {
                build.headsUpContentView = c;
            }
        }
        if (VERSION.SDK_INT >= 16 && qjVar != null) {
            Bundle bundle = build.extras;
        }
        return build;
    }

    public static CharSequence f(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (charSequence.length() > 5120) {
            charSequence = charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    public final long f() {
        return this.j ? this.A.when : 0;
    }
}
