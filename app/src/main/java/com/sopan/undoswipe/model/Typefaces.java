package com.sopan.undoswipe.model;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;

import java.util.Hashtable;

public final class Typefaces {

  private static final String TAG = Typefaces.class.getSimpleName();
  private static final Hashtable<String, Typeface> cache = new Hashtable<>();

  public Typefaces() {
    // no instances
  }

  public static Typeface get(Context context, String assetPath) {
    synchronized (cache) {
      if (!cache.containsKey(assetPath)) {
        try {
          Typeface t = Typeface.createFromAsset(context.getAssets(), assetPath);
          cache.put(assetPath, t);
        } catch (Exception e) {
          Log.e(TAG, "Could not get typeface '" + assetPath + "' Error: " + e.getMessage());
          return null;
        }
      }
      return cache.get(assetPath);
    }
  }
    public static Typeface getRobotoBlack(Context context) {
      return get(context, "fonts/Roboto-Black.ttf");
      }

    public static Typeface getRobotoMedium(Context context) {
        return get(context, "fonts/Roboto-Medium.ttf");
    }

  }

