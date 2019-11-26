package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: afoj */
public final class afoj {
    private static final List d = Collections.unmodifiableList(Arrays.asList(new String[]{"is_event_type_%s_captured", "stored_events_%s", "expired_events_%s", "sum_time_between_%s_dispatch_ms", "dispatch_count_%s", "last_capture_time_ms_%s", "dispatched_event_count_%s"}));
    public final amur a;
    private final SharedPreferences b;
    private final aydc c;

    public afoj(SharedPreferences sharedPreferences, amur amur, aydc aydc) {
        this.b = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.a = (amur) amqw.a((Object) amur);
        this.c = aydc;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(String str, int i, int i2) {
        if (this.a.containsKey(str)) {
            Editor edit = this.b.edit();
            edit.putInt(String.format("stored_events_%s", new Object[]{str}), i);
            String format = String.format("expired_events_%s", new Object[]{str});
            edit.putInt(format, this.b.getInt(format, 0) + i2);
            edit.putBoolean(String.format("is_event_type_%s_captured", new Object[]{str}), true);
            edit.apply();
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(String str, int i, long j) {
        if (this.a.containsKey(str)) {
            Editor edit = this.b.edit();
            String format = String.format("sum_time_between_%s_dispatch_ms", new Object[]{str});
            edit.putLong(format, this.b.getLong(format, 0) + j);
            String format2 = String.format("dispatch_count_%s", new Object[]{str});
            edit.putInt(format2, this.b.getInt(format2, 0) + 1);
            format2 = String.format("dispatched_event_count_%s", new Object[]{str});
            edit.putInt(format2, this.b.getInt(format2, 0) + i);
            edit.putBoolean(String.format("is_event_type_%s_captured", new Object[]{str}), true);
            edit.apply();
        }
    }

    public final void a(String str, long j) {
        if (this.a.containsKey(str)) {
            this.b.edit().putLong(String.format("last_capture_time_ms_%s", new Object[]{str}), j).apply();
        }
    }

    public final long a(String str) {
        return this.b.getLong(String.format("last_capture_time_ms_%s", new Object[]{str}), -1);
    }

    public final void b(String str) {
        Editor edit = this.b.edit();
        for (String format : d) {
            edit.remove(String.format(format, new Object[]{str}));
        }
        edit.apply();
    }

    public final synchronized aque b(String str, long j) {
        if (!this.b.getBoolean(String.format("is_event_type_%s_captured", new Object[]{str}), false)) {
            return null;
        }
        aquh aquh = (aquh) aque.h.createBuilder();
        int a = aqug.a(((Integer) this.a.get(str)).intValue());
        aquh.copyOnWrite();
        aque aque = (aque) aquh.instance;
        if (a != 0) {
            aque aque2;
            aque.a |= 1;
            aque.b = a - 1;
            a = this.b.getInt(String.format("stored_events_%s", new Object[]{str}), 0);
            aquh.copyOnWrite();
            aque = (aque) aquh.instance;
            aque.a |= 2;
            aque.c = a;
            a = this.b.getInt(String.format("expired_events_%s", new Object[]{str}), 0);
            aquh.copyOnWrite();
            aque = (aque) aquh.instance;
            aque.a |= 4;
            aque.d = a;
            a = this.b.getInt(String.format("dispatch_count_%s", new Object[]{str}), 0);
            if (a != 0) {
                long j2 = this.b.getLong(String.format("sum_time_between_%s_dispatch_ms", new Object[]{str}), 0) / ((long) a);
                aquh.copyOnWrite();
                aque2 = (aque) aquh.instance;
                aque2.a |= 8;
                aque2.e = (int) j2;
            }
            int i = this.b.getInt(String.format("dispatched_event_count_%s", new Object[]{str}), 0);
            aquh.copyOnWrite();
            aque2 = (aque) aquh.instance;
            aque2.a |= 64;
            aque2.g = i;
            if (a(str) == -1) {
                aquh.a(-1);
            } else {
                aquh.a((int) (j - a(str)));
            }
            return (aque) ((anxl) aquh.build());
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        aydc aydc = this.c;
        return aydc != null && aydc.b;
    }
}
