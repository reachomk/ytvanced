package org.chromium.base;

import android.content.res.AssetFileDescriptor;
import android.util.Log;
import defpackage.bchn;
import java.io.IOException;

public class ApkAssets {
    public static long[] open(String str) {
        String str2 = "Unable to close AssetFileDescriptor";
        String str3 = "ApkAssets";
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = bchn.a.getAssets().openNonAssetFd(str);
            long[] jArr = new long[]{(long) assetFileDescriptor.getParcelFileDescriptor().detachFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength()};
            try {
                assetFileDescriptor.close();
            } catch (IOException e) {
                Log.e(str3, str2, e);
            }
            return jArr;
        } catch (IOException e2) {
            if (!(e2.getMessage().equals("") || e2.getMessage().equals(str))) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error while loading asset ");
                stringBuilder.append(str);
                stringBuilder.append(": ");
                stringBuilder.append(e2);
                Log.e(str3, stringBuilder.toString());
            }
            long[] jArr2 = new long[]{-1, -1, -1};
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException e3) {
                    Log.e(str3, str2, e3);
                }
            }
            return jArr2;
        } catch (Throwable th) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException e32) {
                    Log.e(str3, str2, e32);
                }
            }
        }
    }
}
