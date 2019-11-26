package com.google.android.libraries.gcoreclient.cast.framework.impl;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import defpackage.pko;
import defpackage.pkz;
import defpackage.tcg;
import defpackage.tcu;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public final class CastOptionsProviderImpl implements pkz {
    public static final String OPTIONS_PROVIDER_CLASS_NAME_KEY = "com.google.android.libraries.gcoreclient.cast.framework.OPTIONS_PROVIDER_CLASS_NAME";
    public tcg optionsProvider;

    public final List getAdditionalSessionProviders(Context context) {
        return null;
    }

    public final pko getCastOptions(Context context) {
        this.optionsProvider = consumeOptionsProvider(context);
        tcg tcg = this.optionsProvider;
        if (tcg != null) {
            return ((tcu) tcg.getCastOptions(context)).a;
        }
        throw new IllegalStateException("optionsProvider is null");
    }

    private final tcg consumeOptionsProvider(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                return (tcg) Class.forName(bundle.getString(OPTIONS_PROVIDER_CLASS_NAME_KEY)).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new IllegalStateException("meta data is null");
        } catch (NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Failed consuming options", e);
        }
    }
}
