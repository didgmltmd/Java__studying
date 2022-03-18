class Solution {
    public int[] solution(int N, int[] stages) {        
        int[] stage_people = null;
        int[] stage_failure1 = null;
        int[] stage_failure2 = null;
        int[] answer = null;
        int[] sort_fail = null;
        
        stage_failure2 = new int[N];
        sort_failure = new int[N];
        answer = new int[N];
        stage_people = new int[N];
        stage_failure = new int[N];
        
        int stage = 1;
        for(int i = 0; i < N - 1;i++){
            for(int j = 0; j < stages.length;j++){
                if(stages[j] >= stage){
                    stage_people[i]++;
                }
            }
            stage++;
        }
        
        for(int i = 0; i < N - 1 ; i++ ){
            if(i == stage_people.length){
                stage_failure[i] = 1;
            }
            else{
                stage_failure[i] = (stage_failure[i] - stage_failure[i + 1]) / stage_failure[i];
            }
        }
        sotr_failure[0] = stage_failure[0];
        for(int i = 0; i < N ; i++){
            answer[i] = i+1;
        }
        for(int i = 0;i<N;i++){
            stage_failure2[i] = stage_failure1[i];    
        }
        for(int i = 0;i<N;i++){
            for(int j = 0; j<i;j++){
                if(stage_failure1[i] > stage_failure2[j]){
                    int buffer;
                    buffer = stage_failure1[i];
                    stage_failure1[i] = stage_failure2[j];
                    stage_failure2[j] = buffer;
                    
                    buffer = stage_failure1[j];
                    stage_failure2[i] = stage_failure2[j];
                    stage_failure2[j] = buffer
                    
                    buffer = answer[j];
                    answer[j] = answer[i];
                    answer[i] = buffer;
                }
            }
        }
        return answer;
    }