Map<Integer, Integer> mp =new HashMap();
        int count =0;
        for(int i: arr){
            if(mp.containsKey(target-i)){
                count+=mp.get(target-i);
            }
            mp.put(i, mp.getOrDefault(i,0)+1);
        }
        return count;
}
}
