/*
 * Lolo
 * ConversionUtils.java
 *
 * Copyright (c) 2015. FunPlus. All rights reserved.
 */

package com.github.derlio.waveform.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/**
 * Utility class with methods for converting Android dimension units.
 */
public final class ConversionUtils
{
	private ConversionUtils()
	{
		// Hiding constructor
	}

	/**
	 * This method converts dp unit to equivalent pixels, depending on device density.
	 *
	 * @param context Context to get resources and device specific display metrics
	 * @param dp      A value in dp (density independent pixels) unit. Which we need to convert into pixels
	 * @return A float value to represent px equivalent to dp depending on device density
	 */
	public static float dpToPx(Context context, float dp)
	{
		Resources resources = context.getResources();
		DisplayMetrics metrics = resources.getDisplayMetrics();
		return dp * (metrics.densityDpi / 160.0f);
	}

	/**
	 * This method converts device specific pixels to density independent pixels.
	 *
	 * @param context Context to get resources and device specific display metrics
	 * @param px      A value in px (pixels) unit. Which we need to convert into db
	 * @return A float value to represent dp equivalent to px value
	 */
	public static float pxToDp(Context context, float px)
	{
		Resources resources = context.getResources();
		DisplayMetrics metrics = resources.getDisplayMetrics();
		return px / (metrics.densityDpi / 160.0f);
	}

	public static float pxToSp(Context context, float px)
	{
		float scaledDensity = context.getResources().getDisplayMetrics().scaledDensity;
		return px / scaledDensity;
	}
}
