package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* renamed from: agmx */
public final class agmx {
    public SQLiteDatabase a;
    public final Context b;
    public final Object c = new Object();

    public agmx(Context context) {
        this.b = context;
    }

    public final boolean a() {
        boolean z;
        synchronized (this.c) {
            SQLiteDatabase sQLiteDatabase = this.a;
            z = false;
            if (sQLiteDatabase != null) {
                if (sQLiteDatabase.isOpen()) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final azqp a(String str) {
        if (a()) {
            SQLiteDatabase sQLiteDatabase = this.a;
            String[] strArr = new String[1];
            String str2 = "progress";
            strArr[0] = str2;
            Cursor query = sQLiteDatabase.query("ytb_progress", strArr, "transfer_id = ?", new String[]{str}, null, null, null);
            int columnIndex = query.getColumnIndex(str2);
            azqo azqo = (azqo) azqp.h.createBuilder();
            String valueOf;
            try {
                if (query.moveToNext()) {
                    byte[] blob = query.getBlob(columnIndex);
                    if (blob != null) {
                        azqp azqp = (azqp) ((anxl) ((azqo) ((anvi) azqo.mergeFrom(blob, anxa.c()))).build());
                        query.close();
                        return azqp;
                    }
                    query.close();
                    return null;
                }
                String str3 = "No ytb progress in DB!?!?! transferId: ";
                valueOf = String.valueOf(str);
                if (valueOf.length() == 0) {
                    valueOf = new String(str3);
                } else {
                    valueOf = str3.concat(valueOf);
                }
                xtl.c(valueOf);
                return null;
            } catch (SQLiteException | anyg e) {
                valueOf = "failed To get ytb progress!?!?! transferId: ";
                str = String.valueOf(str);
                if (str.length() == 0) {
                    str = new String(valueOf);
                } else {
                    str = valueOf.concat(str);
                }
                xtl.a(str, e);
                return null;
            } finally {
                query.close();
            }
        } else {
            throw new IllegalStateException("YTB Progress DB is not open!");
        }
    }

    public final void a(String str, Uri uri, azqp azqp) {
        if (a()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("transfer_id", str);
            contentValues.put("progress", azqp.toByteArray());
            contentValues.put("uri", agmx.a(uri));
            Throwable e = null;
            int i = 0;
            while (i < 20) {
                synchronized (this.c) {
                    try {
                        if (this.a.replaceOrThrow("ytb_progress", null, contentValues) != -1) {
                            if (i != 0) {
                                xtl.c(String.format(Locale.US, "YTB progress DB update successful, but after %d retries", new Object[]{Integer.valueOf(i)}));
                            }
                        } else {
                            throw new SQLException("Unknown DB error when writing progress to DB.");
                        }
                    } catch (SQLException e2) {
                        e = e2;
                        xtl.a("Exception when updating YTB progress in DB. Retrying.", e);
                        i++;
                    }
                }
                return;
            }
            throw new IOException(e);
        }
        throw new IllegalStateException("YTB Progress DB is not open!");
    }

    public final void b(String str) {
        this.a.delete("ytb_progress", "transfer_id = ?", new String[]{str});
    }

    public static String a(Uri uri) {
        if (!xvt.a(uri)) {
            return uri.toString();
        }
        String path = uri.getPath();
        if (TextUtils.isEmpty(path)) {
            String valueOf = String.valueOf(uri);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 23);
            stringBuilder.append("Empty filepath for URI ");
            stringBuilder.append(valueOf);
            throw new IllegalStateException(stringBuilder.toString());
        }
        File file = new File(path);
        try {
            file = file.getCanonicalFile();
        } catch (IOException unused) {
        }
        return Uri.fromFile(file).toString();
    }
}
