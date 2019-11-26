package defpackage;

import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.youtube.R;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* renamed from: agxl */
public abstract class agxl extends Service implements agyf {
    public Executor a;
    public Map b;
    public boolean c;
    public Set d;
    public agyd e;
    public int f;
    private agxq g;
    private SharedPreferences h;
    private OnSharedPreferenceChangeListener i;

    public abstract int a();

    public abstract agyd a(agyg agyg);

    public void a(int i, boolean z) {
        throw null;
    }

    public void a(agqz agqz) {
        throw null;
    }

    public void a(agqz agqz, int i, agqf agqf) {
        throw null;
    }

    public void a(agqz agqz, boolean z) {
        throw null;
    }

    public void a(Map map) {
        throw null;
    }

    public abstract void b();

    public void b(agqz agqz) {
        throw null;
    }

    public abstract String c();

    public boolean d() {
        throw null;
    }

    public void onCreate() {
        super.onCreate();
        this.a = new agxo(this);
        this.e = a(new agxp(this));
        this.d = new CopyOnWriteArraySet();
        this.g = new agxq(this);
        if (!TextUtils.isEmpty(c())) {
            this.h = ((wwz) getApplication()).i().ox();
            this.i = new agxn(this);
            this.h.registerOnSharedPreferenceChangeListener(this.i);
        }
        e();
        this.f = a();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        this.e.a(intent);
        return 1;
    }

    public void onDestroy() {
        OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = this.i;
        if (onSharedPreferenceChangeListener != null) {
            this.h.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
        this.e.c();
        super.onDestroy();
    }

    public final IBinder onBind(Intent intent) {
        return this.g;
    }

    public final boolean a(agxk agxk) {
        if (!this.d.add((agxk) amqw.a((Object) agxk))) {
            return false;
        }
        if (this.c) {
            agxk.a();
        }
        return true;
    }

    public final void e() {
        boolean equals;
        if (c() != null) {
            String string = getString(R.string.wifi);
            equals = TextUtils.equals(this.h.getString(c(), !d() ? null : string), string);
        } else {
            equals = false;
        }
        this.f = this.e.a(equals);
    }
}
