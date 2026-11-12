if (nums[i] == target[i]) continue;
            ans++;
            break;
        }

        for (int j = i; j < n; j++) {
            maxi = Math.max(nums[j], maxi);
        }

        i--;

        while (i >= 0 && nums[i] >= maxi && target[i] == nums[i]) {
            ans++;
            maxi = Math.max(maxi, nums[i]);
            i--;
        }

        i++;

        Arrays.sort(nums, i, n);

        for (int l = i, r = n - 1; l < r; l++, r--) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
        }

        if (Arrays.equals(nums, target)) return ans;
        return 0;
    }
}