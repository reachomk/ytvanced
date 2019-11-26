package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: alyz */
public final class alyz {
    private final Context a;
    private final ScheduledExecutorService b;
    private final String c = "youtube_upload_service";
    private final int d = 60;
    private ScheduledFuture e;
    private SQLiteDatabase f;

    public alyz(Context context, ScheduledExecutorService scheduledExecutorService) {
        ambx ambx = new ambx();
        amby amby = new amby();
        this.a = context;
        this.b = scheduledExecutorService;
    }

    private final synchronized void d() {
        try {
            if (this.f == null) {
                this.f = new alzd(this.a, this.c).getWritableDatabase();
            }
        } catch (SQLiteException e) {
            throw new alzc("Could not open the database", e);
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a() {
        try {
            SQLiteDatabase sQLiteDatabase = this.f;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
                this.f = null;
            }
        } catch (SQLiteException e) {
            throw new alzc("Could not close the database", e);
        }
    }

    public final synchronized boolean a(String str, amea amea) {
        amqw.a(amea.C);
        e();
        try {
            return this.f.insertOrThrow("job_storage_jobs", null, alyz.c(str, amea)) >= 0;
        } catch (SQLiteException | IllegalStateException e) {
            throw new alzc("Error inserting into the database", e);
        }
    }

    public final synchronized amea a(String str) {
        e();
        Cursor query;
        try {
            query = this.f.query("job_storage_jobs", new String[]{"version", "data"}, "id = ?", new String[]{str}, null, null, null);
            if (query.moveToFirst()) {
                int i = query.getInt(query.getColumnIndexOrThrow("version"));
                byte[] blob = query.getBlob(query.getColumnIndexOrThrow("data"));
                if (query.moveToNext()) {
                    throw new AssertionError("Multiple jobs with the same id were found");
                }
                amea a = a(str, blob, i);
                query.close();
                return a;
            }
            query.close();
            return null;
        } catch (SQLiteException | IllegalStateException e) {
            throw new alzc("Error querying the database", e);
        } catch (Throwable th) {
            query.close();
        }
    }

    public final synchronized Map b() {
        HashMap hashMap;
        e();
        Cursor query;
        try {
            hashMap = new HashMap();
            query = this.f.query("job_storage_jobs", new String[]{"id", "version", "data"}, null, null, null, null, null);
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("version");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("data");
            while (query.moveToNext()) {
                String string = query.getString(columnIndexOrThrow);
                amea a = a(string, query.getBlob(columnIndexOrThrow3), query.getInt(columnIndexOrThrow2));
                if (a != null) {
                    if (hashMap.put(string, a) != null) {
                        throw new AssertionError("Multiple jobs with the same id were found");
                    }
                }
            }
            query.close();
        } catch (SQLiteException | IllegalStateException e) {
            throw new alzc("Error querying the database", e);
        } catch (Throwable th) {
            query.close();
        }
        return hashMap;
    }

    public final synchronized Map c() {
        return a(alyy.a);
    }

    private final synchronized Map a(amqv amqv) {
        LinkedHashMap linkedHashMap;
        ArrayList arrayList = new ArrayList(b().entrySet());
        Collections.sort(arrayList, new alzb());
        linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Entry entry = (Entry) arrayList.get(i);
            if (amqv.a((amea) entry.getValue())) {
                linkedHashMap.put((String) entry.getKey(), (amea) entry.getValue());
            }
        }
        return linkedHashMap;
    }

    private final synchronized boolean b(String str, amea amea) {
        e();
        try {
            int update = this.f.update("job_storage_jobs", alyz.c(str, amea), "id = ?", new String[]{str});
            if (update <= 1) {
                return update == 1;
            } else {
                throw new AssertionError("Multiple jobs with the same id were found");
            }
        } catch (SQLiteException | IllegalStateException e) {
            throw new alzc("Error updating the database", e);
        }
    }

    public final synchronized ambv a(String str, alzf alzf) {
        e();
        try {
            this.f.beginTransaction();
            amea a = a(str);
            amea a2 = alzf.a(a);
            ambv ambv;
            if (amqq.a(a2, a)) {
                ambv = new ambv(a, a2);
                ((SQLiteDatabase) amqw.a(this.f)).endTransaction();
                return ambv;
            }
            if (a != null || a2 == null) {
                if (a2 != null) {
                    if (!b(str, a2)) {
                        throw new AssertionError("Update failed after a read, in a transaction");
                    }
                } else if (!b(str)) {
                    throw new AssertionError("Delete failed after a read, in a transaction");
                }
            } else if (!a(str, a2)) {
                throw new AssertionError("Insert failed after an empty read, in a transaction");
            }
            ((SQLiteDatabase) amqw.a(this.f)).setTransactionSuccessful();
            ambv = new ambv(a, a2);
            ((SQLiteDatabase) amqw.a(this.f)).endTransaction();
            return ambv;
        } catch (SQLiteException e) {
            throw new alzc("Error updating the database in a transaction", e);
        } catch (Throwable th) {
            ((SQLiteDatabase) amqw.a(this.f)).endTransaction();
        }
    }

    private final synchronized boolean b(String str) {
        e();
        try {
            int delete = this.f.delete("job_storage_jobs", "id = ?", new String[]{str});
            if (delete <= 1) {
                return delete == 1;
            } else {
                throw new AssertionError("Multiple jobs with the same id were found");
            }
        } catch (SQLiteException | IllegalStateException e) {
            throw new alzc("Error deleting from the database", e);
        }
    }

    private final synchronized void e() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        d();
        this.e = this.b.schedule(new alza(this), (long) this.d, TimeUnit.SECONDS);
    }

    private static ContentValues c(String str, amea amea) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", str);
        contentValues.put("version", Integer.valueOf(3));
        contentValues.put("data", amea.toByteArray());
        return contentValues;
    }

    private final amea a(String str, byte[] bArr, int i) {
        amea amea = null;
        try {
            amea amea2 = (amea) anxl.parseFrom(amea.U, bArr, anxa.c());
            if (i != 1) {
                if (i == 2) {
                    amdz amdz = (amdz) ((anxo) amea2.toBuilder());
                    if (((amea) amdz.instance).C) {
                        amea = (amea) ((anxl) amdz.build());
                    } else {
                        amdz.f();
                        if (!amdz.h()) {
                            if (amdz.g()) {
                                amec amec = ((amea) amdz.instance).N;
                                if (amec == null) {
                                    amec = amec.g;
                                }
                                int a = amee.a(amec.b);
                                if (a == 0 || a != 2) {
                                    amec = ((amea) amdz.instance).Q;
                                    if (amec == null) {
                                        amec = amec.g;
                                    }
                                    int a2 = amee.a(amec.b);
                                    if (a2 == 0 || a2 != 2) {
                                        amec = amec.g;
                                    }
                                    amdz.m(amec);
                                    amec = ((amea) amdz.instance).w;
                                    if (amec == null) {
                                        amec = amec.g;
                                    }
                                    amdz.g(ambx.a(amec));
                                    amec = ((amea) amdz.instance).I;
                                    if (amec == null) {
                                        amec = amec.g;
                                    }
                                    amdz.h(ambx.a(amec));
                                    amdz.b(ambx.a(amdz.c()));
                                    amdz.i(ambx.a(amdz.c()));
                                    amec = ((amea) amdz.instance).O;
                                    if (amec == null) {
                                        amec = amec.g;
                                    }
                                    amdz.l(ambx.a(amec));
                                    amec = ((amea) amdz.instance).v;
                                    if (amec == null) {
                                        amec = amec.g;
                                    }
                                    amdz.f(ambx.a(amec));
                                    amdz.a(ambx.a(amdz.b()));
                                    amec = ((amea) amdz.instance).t;
                                    if (amec == null) {
                                        amec = amec.g;
                                    }
                                    amdz.d(ambx.a(amec));
                                    amdz.c(ambx.a(amdz.e()));
                                    amec = ((amea) amdz.instance).u;
                                    if (amec == null) {
                                        amec = amec.g;
                                    }
                                    amdz.e(ambx.a(amec));
                                    amec = ((amea) amdz.instance).K;
                                    if (amec == null) {
                                        amec = amec.g;
                                    }
                                    amdz.j(ambx.a(amec));
                                } else {
                                    amdz.m(amjq.a());
                                    amdz.g(amjq.a());
                                    amdz.h(amjq.a());
                                    amdz.b(amjq.a());
                                    amdz.i(amjq.a());
                                    amdz.l(amjq.a());
                                    amdz.f(amjq.a());
                                    amdz.a(amjq.a());
                                    amdz.d(amjq.a());
                                    amdz.c(amjq.a());
                                    amdz.e(amjq.a());
                                    amdz.j(amjq.a());
                                }
                            } else {
                                amdz.h(amec.g);
                                if ((((amea) amdz.instance).a & 65536) == 0) {
                                    amdz.d(amec.g);
                                } else {
                                    amdz.d(amjq.a());
                                }
                            }
                        }
                        amea = (amea) ((anxl) amdz.build());
                    }
                } else if (i == 3) {
                    amea = amea2;
                }
            }
        } catch (anyg unused) {
        }
        if (amea == null) {
            b(str);
        } else if (i < 3) {
            b(str, amea);
            return amea;
        }
        return amea;
    }
}
